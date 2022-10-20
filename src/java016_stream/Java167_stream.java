package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java167_stream {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		
		FileReader fr = null;
		int data;
		
		try {
			fr = new FileReader(file);
//			System.out.println(fr.read());
			
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
