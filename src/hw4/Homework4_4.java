package hw4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入金額");
		int data = sc.nextInt();
		int people = 0, id = 0;
		int[][] m = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.print("有錢可借的"+"\n員工編號:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (data <= m[i][j]) {
					System.out.print(m[0][j] + " ");
					people++;
				}
			}
		}
		System.out.println("\n共" + people + "人");
		sc.close();
	}
}
