package hw4;

public class Homework4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
		String[] strArray = s.split("");
		for(int i = strArray.length - 1 ; i >= 0 ; i--) {
			System.out.print(strArray[i]);
		}
//		char[] charArray = s.toCharArray();
//		StringBuilder q = new StringBuilder(s).reverse();
//        System.out.println(q);
//		for(int i = charArray.length; i > 0 ; i--) {
//			System.out.print(charArray[i - 1]);
//		}
//		System.out.println(s[0].length());
		
    }
}
