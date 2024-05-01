package hw4;

public class Homework4_1 {
	public static void main(String[] args) {
		int sum = 0;
		int[] i = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		int a = sum / 10;
		System.out.println("所有元素的平均值為:" + a);
		System.out.print("大於平均值的元素有:");
		for (int j = 0; j < i.length; j++) {
			if (i[j] > a) {
				System.out.print(i[j] + " ");
			}
		}
	}
}
