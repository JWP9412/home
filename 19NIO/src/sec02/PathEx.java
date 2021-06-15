package sec02;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:\\Users\\USER\\eclipse-workspace\\fromEz\\EzenJava\\19NIO\\src\\sec02\\PathEx.java");
		System.out.println("파일명 : "+path.getFileName());
		System.out.println("부모 디렉토리명 : "+path.getParent().getFileName());
		System.out.println("중첩 경로수 : "+ path.getNameCount());
		
		System.out.println();
		for(int x=0; x<path.getNameCount();x++) {
			System.out.println(path.getName(x));
		}

	}

}
