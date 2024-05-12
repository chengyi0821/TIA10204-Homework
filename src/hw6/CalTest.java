package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值");
				int x1 = sc.nextInt();
				System.out.println("請輸入y的值");
				int y1 = sc.nextInt();
				Calculator cal = new Calculator(x1, y1);
				sc.close();
				break;
			} catch (InputMismatchException e) {
				System.out.println("請輸入正確的格式!");
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
