package java016_stream;

import java.io.File;
import java.io.FileWriter;

public class Java166_stream {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());

		FileWriter fw = null;

		try {
			// mode의 값이 true이면 append
			// mode의 값이 false이면 update
			// mode의 겂이 생략하면 false이다.
			fw = new FileWriter(file, false);
			fw.write("java\n"); // buffer에 저장
			fw.flush(); // 반영
			fw.write("jsp\n");
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' });
			fw.flush();
			fw.write("\n");
			fw.flush();
			fw.write(97);
			fw.flush();
			fw.write("\n");
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' }, 0, 3);
			fw.write("\n");
			fw.close(); //연결종료
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
