package hw5;

public class Homework5_3 {
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Work03 w = new Work03();
		System.out.println("intArray最大值為:" + "\n" + w.maxElement(intArray));
		System.out.println("doubleArray最大值為:" + "\n" + w.maxElement(doubleArray));
	}
}

class Work03 {
	public int maxElement(int x[][]) {
		int num1 = 0;
		for (int i = 0; i < x.length; i++) {
			num1 = x[i][0];
			for (int j = 0; j < x[i].length; j++) {
				if (num1 < x[i][j]) {
					num1 = x[i][j];
				}
			}
		}
		return num1;
	}

	public double maxElement(double x[][]) {
		double num1 = 0;
		for (int i = 0; i < x.length; i++) {
			num1 = x[i][0];
			for (int j = 0; j < x[i].length; j++) {
				if (num1 < x[i][j]) {
					num1 = x[i][j];
				}
			}
		}
		return num1;
	}
}
