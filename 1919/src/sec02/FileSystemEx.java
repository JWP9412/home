package sec02;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemEx {

	public static void main(String[] args) throws Exception{
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()) {
			System.out.println("드라이버명 : " + store.name() );
			System.out.println("파일시스템 : " + store.type() );
			System.out.println("전체 공간 : " + store.getTotalSpace() + " bytes | "+ (store.getTotalSpace() / (1024*1000000)) + " gb");
			System.out.println("사용 중인 공간 : " + (store.getTotalSpace() - store.getUsableSpace()) + " bytes" );
			System.out.println("사용 가능한 공간 : " + store.getUsableSpace() + " bytes | " + (store.getUsableSpace() / (1024*1000)) + " mb");
			System.out.println();
		}
		
		System.out.println("파일 구분자 : " + fs.getSeparator());
		System.out.println();
		
		for(Path path : fs.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}

}
