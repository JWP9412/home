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
		ByteBuffer db = ByteBuffer.allocateDirect((int) size);		//넌다이렉트 버퍼와 다이렉트 버퍼 생성
		
		long start,end;
		
		start = System.nanoTime();		//넌다이렉트 버퍼 테스트
		for(int i=0;i<100;i++) {
			fc_from.read(ndb);
			ndb.flip();
			fc_to1.write(ndb);
			ndb.clear();
		}
		end=System.nanoTime();
		System.out.println("넌다이렉트 :\t" + (end-start) + " ns");
		
		fc_from.position(0);		//파일의 위치를 0으로 설정(초기화)
		
		start = System.nanoTime();		//다이렉트 버퍼 테스트
		for(int i=0;i<100;i++) {
			fc_from.read(db);
			db.flip();
			fc_to2.write(db);
			db.clear();
		}
		end=System.nanoTime();
		System.out.println("다이렉트 :\t" + (end-start) + " ns");
		
		fc_from.close();
		fc_to1.close();
		fc_to2.close();
		
	}

}
