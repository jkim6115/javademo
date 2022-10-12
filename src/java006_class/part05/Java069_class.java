package java006_class.part05;

public class Java069_class {
	public static void main(String[] args) {
		MemberVar mv = new MemberVar();
		System.out.printf("mv.var_byte : %d\n", mv.var_byte);
		System.out.printf("mv.var_short : %d\n", mv.var_short);
		System.out.printf("mv.var_int : %d\n", mv.var_int);
		System.out.printf("mv.var_long : %d\n", mv.var_long);
		System.out.printf("mv.var_float : %.1f\n", mv.var_float);
		System.out.printf("mv.var_double : %.1f\n", mv.var_double);
		System.out.printf("mv.var_boolean : %b\n", mv.var_boolean);
		System.out.printf("mv.var_char : %c\n", mv.var_char);
		System.out.printf("mv.var_string : %d\n", mv.var_string);
		System.out.printf("mv.var_arr : %d\n", mv.var_arr);
		
		//지역변수는 기본값을 제공하지 않는다.
	}
}
