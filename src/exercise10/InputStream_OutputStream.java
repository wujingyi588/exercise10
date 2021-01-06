package exercise10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStream_OutputStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file1 = new File("src/exercise10/text1.txt");
		File file2 = new File("src/exercise10/text2.txt");
		
		FileInputStream inFile = new FileInputStream(file1);
		FileOutputStream outFile = new FileOutputStream(file2);
		
		int buff;
		while((buff = inFile.read()) != -1) {
			System.out.print((char)buff);
			outFile.write(buff);
		}
	}

}
