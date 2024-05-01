package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		i = (int)(Math.random() * 101);
		System.out.println("開始猜數字吧!");
		while(true) {
			int data = sc.nextInt();
			if (data > i) {	
				System.out.println("你大於正確答案");
			} else if(data < i){
					System.out.println("你小於正確答案");
				}else {
				System.out.println("答對了!答案就是" + i);
				break;
			}
		}
	}
}
