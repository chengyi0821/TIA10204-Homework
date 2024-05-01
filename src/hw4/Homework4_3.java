package hw4;

public class Homework4_3 {
	public static void main(String[] args) {
		String[] s = new String[] { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int n = 0;
		for (int num = 0; num < s.length; num++) {
			for (int num1 = 0; num1 < s[num].length(); num1++) {
				if (s[num].charAt(num1) == 'a' || 
					s[num].charAt(num1) == 'e' || 
					s[num].charAt(num1) == 'i' || 
					s[num].charAt(num1) == 'o' || 
					s[num].charAt(num1) == 'u') {
					n++;
				}
			}
		}
		System.out.println("陣列裡面總共有" + n + "個母音");
	}
}
