package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * kim 56 78 12 146
 * hong 46 100 97 243
 * park 96 56 88 240
 */

import java.util.Vector;

public class Java183_Vector {
	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	} // end main

	private static Vector<Sawon> lines(String filename) {
		// strname 매개변수 값을 이용해서 Vector에 데이터를 저장한 후 반환
	
		Vector<Sawon> vt = new Vector<Sawon>();
		try(Scanner sc = new Scanner(new File(filename))) { //스캐너를 통해 score.txt에서 데이터를 읽어옴
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
				vt.add(sn);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		return vt;
	}

	private static void prnDisplay(Vector<Sawon> vt) {
		for(Sawon sn : vt) {
			System.out.print(sn.toString());
		}

	}
} // end class
