package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java169_stream {
	public static void main(String[] args) {
		File file = new File("src/java016_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			// "r" : 읽기(read)만 가능
			// "rw" : 읽기 쓰기 가능
			raf = new RandomAccessFile(file, "r");
			
			//현재 위치 리턴
			System.out.println(raf.getFilePointer()); //0
			System.out.println((char)raf.read()); //k
			System.out.println(raf.getFilePointer()); //1
			System.out.println(raf.readLine()); //im:56/78/12
			System.out.println(raf.getFilePointer()); //14 <- \n 때문
			System.out.println(raf.readLine()); //hong:46/100/97
			System.out.println(raf.getFilePointer()); //30
			//포인터의 위치 변경 (파일 처음부터 포인터를 찾는다.)
			raf.seek(4); //kim:56/78/12
			System.out.println((char)raf.read());
			System.out.println(raf.readLine());
			
			//지정된 수 만큼 byte를 건너뛴다. (현재 포인터가 있는 위치를 기준으로 건너뛴다.
			raf.skipBytes(2);
			System.out.println(raf.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
