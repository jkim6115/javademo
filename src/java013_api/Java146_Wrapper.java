package java013_api;

// Some Unicode character ranges that contain digits: 
//
//	•'\u005Cu0030' through '\u005Cu0039',ISO-LATIN-1 digits ('0' through '9') 
//	•'\u005Cu0660' through '\u005Cu0669',Arabic-Indic digits 
//	•'\u005Cu06F0' through '\u005Cu06F9',Extended Arabic-Indic digits 
//	•'\u005Cu0966' through '\u005Cu096F',Devanagari digits 
//	•'\u005CuFF10' through '\u005CuFF19',Fullwidth digits 


public class Java146_Wrapper {
	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		
//		char[] arr = sn.toCharArray();
//		for(int i = 0; i < arr.length; i++) {
//			if(Character.isDigit(arr[i])) {
//				cnt++;
//			}
//		}
		
//		for(int i = 0; i < sn.length(); i++) {
//			char data = sn.charAt(i);
//			if(Character.isDigit(data)) {
//				cnt++;
//			}
//		}
		System.out.println("숫자개수:"+cnt);
	}
}
