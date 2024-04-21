package hw1;

public class homework1 {
	public static void main(String[] args) {
		System.out.println("問題一:");
		System.out.println("和是" + (12 + 6));
		System.out.println("積是" + 12 * 6);
		
		

		System.out.println("問題二:");
		System.out.println("200顆蛋共是" + 200 / 12 + "打" + 200 % 12 + "顆");
		
		

		System.out.println("問題三:");
		int totalsecond = 256559;
		System.out.println("256559秒為" + totalsecond / 60 / 60 / 24 + "天" + totalsecond / 60 / 60 % 24 + "小時"
				+ totalsecond / 60 % 60 + "分" + totalsecond % 60 + "秒");
		
		

		System.out.println("問題四:");
		final double E = 3.1415;
		System.out.println("圓面積為" + E * Math.pow(5, 2) + "圓周長為" + 5 * 2 * E);
		
		

		System.out.println("問題五:");
		System.out.println("本金加利息共有" + 1500000 * Math.pow(1 + 0.02, 10));
		
		

		System.out.println("問題六:");
		System.out.println(5 + 5);
		// 5+5 整數相加
		System.out.println(5 + '5');
		// 單引號是char 所以會轉換unicode為53
		System.out.println(5 + "5");
		// 雙引號是字串String的關系 所以會做字串的相加
	}
}
