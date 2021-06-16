package sec03;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceEx {

	public static void main(String[] args) throws Exception{
		Path from = Paths.get("C:\\te\\forest.jpg");
		Path to1 = Paths.get("C:\\te\\forest.jpg");
		Path to2 = Paths.get("C:\\te\\forest.jpg");

		long size = Files.size(from);
		
		FileChannel fc_from = FileChannel.open(from);
		FileChannel fc_to1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		FileChannel fc_to2 = FileChannel.open(to2, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
	
		ByteBuffer ndb = ByteBuffer.allocate((int) size);
		ByteBuffer db = ByteBuffer.allocateDirect((int) size);		//�ʹ��̷�Ʈ ���ۿ� ���̷�Ʈ ���� ����
		
		long start,end;
		
		start = System.nanoTime();		//�ʹ��̷�Ʈ ���� �׽�Ʈ
		for(int i=0;i<100;i++) {
			fc_from.read(ndb);
			ndb.flip();
			fc_to1.write(ndb);
			ndb.clear();
		}
		end=System.nanoTime();
		System.out.println("�ʹ��̷�Ʈ :\t" + (end-start) + " ns");
		
		fc_from.position(0);		//������ ��ġ�� 0���� ����(�ʱ�ȭ)
		
		start = System.nanoTime();		//���̷�Ʈ ���� �׽�Ʈ
		for(int i=0;i<100;i++) {
			fc_from.read(db);
			db.flip();
			fc_to2.write(db);
			db.clear();
		}
		end=System.nanoTime();
		System.out.println("���̷�Ʈ :\t" + (end-start) + " ns");
		
		fc_from.close();
		fc_to1.close();
		fc_to2.close();
		
	}

}
