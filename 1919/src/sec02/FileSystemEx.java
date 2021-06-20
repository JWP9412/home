package sec02;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemEx {

	public static void main(String[] args) throws Exception{
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()) {
			System.out.println("����̹��� : " + store.name() );
			System.out.println("���Ͻý��� : " + store.type() );
			System.out.println("��ü ���� : " + store.getTotalSpace() + " bytes | "+ (store.getTotalSpace() / (1024*1000000)) + " gb");
			System.out.println("��� ���� ���� : " + (store.getTotalSpace() - store.getUsableSpace()) + " bytes" );
			System.out.println("��� ������ ���� : " + store.getUsableSpace() + " bytes | " + (store.getUsableSpace() / (1024*1000)) + " mb");
			System.out.println();
		}
		
		System.out.println("���� ������ : " + fs.getSeparator());
		System.out.println();
		
		for(Path path : fs.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}

}
