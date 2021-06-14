import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class AddLineNumberEx {

	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/Áö¿ø/git/home/18IO/src/sec03/s05/BufferReaderEx.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br =new BufferedReader(fr);
		
		int row =0;
		String rowData;
		while((rowData = br.readLine()) != null) {
			System.out.println(++row +" : " +rowData);
		}
		br.close();
		fr.close();
	}

}
