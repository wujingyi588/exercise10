package exercise10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Scanner_PrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file1 = new File("src/exercise10/text1.txt");
		
		try(PrintWriter output = new PrintWriter(file1)){
            output.println("Scanner_PrintWriter");
        }
		@SuppressWarnings("resource")
		Scanner input = new Scanner(file1);
            while(input.hasNext()){
                String x = input.nextLine();
                System.out.println(x);
            }
        
	}

}
