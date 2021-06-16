package sec03;

import java.nio.ByteBuffer;

public class BufferSizeEx {
	public static void main(String[] args) {
		ByteBuffer db = ByteBuffer.allocateDirect(2000*1024*1024);
		System.out.println("db done");
		
		ByteBuffer ndb = ByteBuffer.allocate(2025*1024*1024);
		System.out.println("ndb done");
	}
}
