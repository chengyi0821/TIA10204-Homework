package hw4;

public class Homework4_6 {
	public static void main(String[] args) {

		int[][] array = new int[][] { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] num = new int[8];
		int o, e;
		for (int i = 0; i < array.length; i++) {
			o = array[i][0];
			e = 0;
			for (int k = 1; k < 8; k++) {
				if (o < array[i][k]) {
					o = array[i][k];
					e = k;
				}
			}
			num[e]++;
		}
		for (int p = 0; p < 8; p++) {
			System.out.println(p + 1 + "號同學最高分的次數為" + num[p]);
		}
	}
}
