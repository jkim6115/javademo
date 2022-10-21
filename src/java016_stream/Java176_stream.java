package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 직렬화
 * 1. 객체를 연속적인 데이터로 변환
 * 		반대는 역직렬화
 * 2. 객체의 맴버변수들의 값을 일렬로 나열하는 것
 * 3. 객체를 저장하기 위해서는 객체를 직렬와 해야함.
 * 4. 객체를 저장한가는 것은 객체의 맴버변수의 값을 저장한다는 것.
 * 5. 객체를 직렬화하여 입출력할 수 있는 스트림
 * 		ObjectInputStream, ObjectOutputStream
 * 6. 직렬화에서 제외할 맴버변수에서는 transient를 선언
 */

class Phone implements Serializable {
	String name;
	int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d\n", name, price);
	} // end Phone
} // end class

public class Java176_stream {
	public static void main(String[] args) {
		File file = new File("src/java016_stream/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);
			
			//객체에 직렬화가 안되어 있으면 exception이 발생한다.
			//java.io.NotSerializableException: java016_stream.Phone
			Phone p = new Phone("android", 5000);
			os.writeObject(p);
			
			os.writeObject(new String("java"));
			System.out.println("객체 저장");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/////////////////////////////////////////////////////////////////////
		
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone)oi.readObject();
			System.out.println(p.toString());
			
			String sn = (String)oi.readObject();
			System.out.println(sn.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oi.close();
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end main
} // end class
