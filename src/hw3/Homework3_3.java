package hw3;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			System.out.print(i + "\t");
			if(i % 6 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文 請輸入你討厭哪個數字");
		int num = sc.nextInt();
		int random, q = 0, passNum = 0, w = 0, p = 0;
		int[] i = new int[49];
		System.out.println("可以選的數字有:");
		for (int r = 1; r < 50; r++) {
			if (r / 10 != num && r % 10 != num) {
				i[r - passNum - 1] = r;
				p++;
				System.out.print(r + "\t");
				if (p % 6 == 0) {
					System.out.println();
				}
			} else
				passNum++;
		}
		System.out.println("\n=======================================");
		System.out.println("祝您中大獎!!");
		while (w < 6) {
			random = (int) (Math.random() * (48 - passNum));
			System.out.print(i[random] + " ");
			p = i[random];
			i[random] = i[(48 - passNum)];
			i[(48 - passNum)] = p;
			passNum++;
			w++;
			sc.close();
		}
	}
}
//cache[0]=1,cache[1]=2,cach[2]=4
