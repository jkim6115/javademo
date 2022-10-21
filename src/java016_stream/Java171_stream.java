package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java171_stream {
	public static void main(String[] args) throws IOException {
//		File file = new File("src/java016_stream/temp");
//		File file = new File("src/java016_stream/a/b");
		File file = new File("src/java016_stream/sample.txt");
		
		//종료시 삭제
		file.deleteOnExit();
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		
//		file.createTempFile("source", "test");

		if (file.isDirectory()) {
//			file.mkdir();
//			file.delete();
//			file.deleteOnExit();
			System.out.println("폴더삭제");
		} else {
			System.out.println("폴더없음");
		}
	}
}
