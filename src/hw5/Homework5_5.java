package hw5;

public class Homework5_5 {
	public static void main(String[] args) {
		genAuthCode();
	}

	public static void genAuthCode() {
		System.out.println("本次隨機產生驗證碼為:");
		int englishUpper = 65;
		int englishLower = 97;
		int[] random = new int[62];
		for (int i = 0; i <= 61; i++) {
			if (i <= 9) {
				random[i] = i; // 數字 0~9 INDEX:0~9
			} else if (i <= 35) {
				random[i] = englishUpper; // 英文大寫 A~Z INDEX:10~35
				englishUpper++;
			} else if (i <= 61) {
				random[i] = englishLower; // 英文小寫 a~z INDEX:36~61
				englishLower++;
			}
		}
		for (int i = 1; i <= 8; i++) {
			int ran = (int) (Math.random() * 62) + 1;
			if (ran <= 9) {
				System.out.print(random[ran]); // 數字0~9
			} else if (ran <= 35 || ran <= 61) {
				System.out.print((char) random[ran]); // 英文大小寫 A~Z a~z
			}
		}
	}
}
