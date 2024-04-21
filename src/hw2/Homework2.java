package hw2;

public class Homework2 {
	public static void main(String[] args) {
		System.out.println("\n=================第一題==================");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("偶數和為:" + sum);
		System.out.println("\n=================第二題==================");
		int p = 1;
		for (int i = 1; i <= 10; i++) {
			p *= i;
		}
		System.out.println("連乘積為:" + p + "(for迴圈)");
		System.out.println("\n=================第三題==================");
		int t = 1;
		int i = 1;
		while (i <= 10) {
			t *= i;
			i++;
		}
		System.out.println("連乘積為:" + t + "(while迴圈)");
		System.out.println("\n=================第四題==================");
		int j = 1;
		for (int o = 3; o <= 21; o++) {
			if (o % 2 != 0) {
				System.out.print(j + " ");
				j += o;
			}
		}
		System.out.print("\n");
		System.out.println("\n=================第五題==================");
		int q = 0;
		for (int num = 1; num <= 49; num++) {
			if ((num / 10 != 4) && (num % 10 != 4)) {
				System.out.print(num + " ");
				q++;
			}
		}
		System.out.println("\n" + "總共" + q);
		System.out.println("\n=================第六題==================");
		for (int u = 10; u >= 1; u--) {
			for (int w = 1; w <= u; w++)
				System.out.print(w);
			System.out.println();
		}
		System.out.println("\n=================第七題==================");
		for (char h = 65; h <= 70; h++) {
			for (char n = 65; n <= h; n++) {
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
