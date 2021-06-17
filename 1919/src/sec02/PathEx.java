package sec02;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathEx {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("C:\\Users\\USER\\eclipse-workspace\\fromEz\\EzenJava\\19NIO\\src\\sec02\\PathEx.java");
		System.out.println("���ϸ� : "+path.getFileName());
		System.out.println("�θ� ���丮�� : "+path.getParent().getFileName());
		System.out.println("��ø ��μ� : "+ path.getNameCount());
		
		System.out.println();
		for(int x=0; x<path.getNameCount();x++) {
			System.out.println(path.getName(x));
		}
		
		System.out.println();
		Iterator<Path> iterator = path.iterator();
		while(iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println(temp.getFileName());
		}

	}

}
