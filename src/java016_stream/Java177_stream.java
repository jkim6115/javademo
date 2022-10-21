package java016_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java177_stream {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter(new File("src/java016_stream/sample.txt"))) {
			fw.write("java\n");
			fw.write("jsp\n");
			fw.write("spring\n");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("=====================================================");
		try(FileReader fr = new FileReader("src/java016_stream/sample.txt");
				BufferedReader br = new BufferedReader(fr)) {
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException ex) {
			System.out.println(ex.toString());
		}
	}// end main
}
