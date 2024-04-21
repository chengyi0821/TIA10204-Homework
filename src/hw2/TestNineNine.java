package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int o = 1;
			while (o <= 9) {
				System.out.printf(i + "x" + o + "=" + i * o + "\t");
				o++;
			}
			System.out.println();
		}
		System.out.println("=====================================================================");

		for (int count = 1; count <= 9; count++) {
			int o = 0;
			do {
				o++;
				System.out.printf(count + "x" + o + "=" + count * o + "\t");
			} while (o < 9);
			System.out.println();
		}
		System.out.println("=====================================================================");

		int p = 0;
		while (p < 9) {
			p++;
			int t = 0;
			do {
				t++;
				System.out.printf(p + "x" + t + "=" + p * t + "\t");
			} while (t < 9);
			System.out.println();
		}
	}
}
