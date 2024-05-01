package hw4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年,月,日");
		int year = sc.nextInt();
		int mouth = sc.nextInt();
		int day = sc.nextInt();
		int t = 0;
		int[] d = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i < mouth; i++) {
			if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
					|| (year % 4 == 0 && year % 100 != 0) && d[2] < 29) {
				d[2]++;
			}
			t += d[i];
		}
		if (day > d[mouth]) {
			System.out.print("請輸入正確的格式");
		} else {
			t = t + day;
			System.out.print("輸入的日期為該年第" + t + "天");
		}
	}
}
