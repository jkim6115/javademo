package java008_static_access.part04;

//javac -d . Java086_args.java
//java java008_static_access.part04.Java086.args hello world
public class Java086_args {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		for(String data : args) {
			System.out.println(data);
		}
	}
}
