package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] side = new int[3];
		System.out.println("請輸入三個整數");
		side[0] = sc.nextInt();
		side[1] = sc.nextInt();
		side[2] = sc.nextInt();
		Arrays.sort(side);
		if (side[0] + side[1] > side[2]) {
			if (side[0] == side[1] && side[1] == side[2]) {
				System.out.println("正三角形");
			} else if (side[0] == side[1] || side[1] == side[2]) {
				System.out.println("等腰三角形");
			} else if (Math.pow(side[0], 2) + Math.pow(side[1], 2) == Math.pow(side[2], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
		sc.close();
	}
}
