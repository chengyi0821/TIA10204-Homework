package hw5;

public class Homework5_2 {
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
		int random, avg = 0, num = 0, changnum = 0;
		int[] array = new int[101];
		for (int i = 0; i < 101; i++) {
			array[i] = i;
		}
		System.out.println("本次亂數結果:");
		for (int i = 1; i <= 10; i++) {
			random = (int) (Math.random() * (101 - changnum));
			System.out.print(array[random] + "\t");
			avg += array[random];
			num = array[random];
			array[random] = array[100 - changnum];
			array[100 - changnum] = num;
			changnum++;
		}
		System.out.println("\n平均值為:" + (avg / 10));
	}
}
