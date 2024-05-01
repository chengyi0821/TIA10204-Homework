package hw3;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文 請輸入你討厭哪個數字");
		int num = sc.nextInt();
		int random, q = 0, passNum = 0, w = 0, p = 0;
		int[] i = new int[49];
		for (int r = 1; r < 50; r++) {
			if (r / 10 != num && r % 10 != num) {
				i[r - passNum - 1] = r;
			} else
				passNum++;
		}
		while (w < 6) {
			random = (int) (Math.random() * (48 - passNum));
			System.out.print(i[random] + " ");
			p = i[random];
			i[random] = i[(48 - passNum)];
			i[(48 - passNum)] = p;
			passNum++;
			w++;

		}
	}
}
//cache[0]=1,cache[1]=2,cach[2]=4
