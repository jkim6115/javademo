package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {
	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("νμΌμμ±");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
