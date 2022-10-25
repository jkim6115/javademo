package ncs.test12;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		fileSave(prop);
		fileOpen(prop);
	}

	public static void fileSave(Properties p) {
		String path = "./src/ncs/test12/data.xml";
		File file = new File(path);
		try {
			if(file.exists()) {
				file.createNewFile();
			}
			p.storeToXML(new FileOutputStream(path), "");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void fileOpen(Properties p) {
		Fruit fruit = new Fruit();
		for(int i = 1; i <= 5; i++) {
			String[] data = p.getProperty(Integer.toString(i)).split(",");
			fruit.setName(data[0]);
			fruit.setPrice(Integer.parseInt(data[1]));
			fruit.setQuantity(Integer.parseInt(data[2]));
			System.out.printf("%d = %s\n", i, fruit.toString());
		}
		
	}
}
