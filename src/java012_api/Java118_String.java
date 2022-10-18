package java012_api;

public class Java118_String {
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		int index = sn.indexOf(":");
		System.out.println("ip: "+sn.substring(1, index));
		System.out.println("port: "+sn.substring(index+1));
	}
}
