package java016_stream.prob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * [문제]
 *  sun.txt파일에서 데이터를 읽어온후 ‘\t’와 ‘ ‘을 ‘-‘ 로 변환하여
 *  프로그램을 구현하시오.
 *   
 * [프로그램 실행결과]
 * hello-world-!!!
 * java-programming
 * jsp-servlet-programming!
 */
public class Prob005_stream {
	public static void main(String args[]) {
		String[] lines = readLines(".\\src\\java016_stream\\prob\\sun.txt");
		
		for (int i = 0; i < lines.length; i++) {
			printLine(lines[i]);
		}
	}

	public static String[] readLines(String fileName) {
		/*
		 * 파라미터로 전달받은 txt파일을 읽어 들여, 파일의 줄 수에 해당하는 String[]을 생성하여 해당 String[]에 한
		 * 라인씩 저장해서 반환한다.
		 */
		Path path = Paths.get(fileName);
		
		try {
			long lines = Files.lines(path).count();
			String[] arr = new String[(int) lines];
			try(Scanner sc = new Scanner(new File(fileName))) {
				while(sc.hasNextLine()) {
					for(int i = 0; i < arr.length; i++) {
						arr[i] = sc.nextLine();
					}
				}
			}
			return arr;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return null;
	}// end readLines()

	public static void printLine(String line) {
		/*
		 * 문자열을 받아들여 ‘\t’와 ‘ ‘을 ‘-‘ 로 변환하여 콘솔에 출력한다.
		 */
		System.out.println(line.replaceAll(" ", "-").replace("\t", "-"));
		
	}// end printLine()
}// end class
