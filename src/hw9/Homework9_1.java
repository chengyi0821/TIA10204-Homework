package hw9;

public class Homework9_1 implements Runnable {
	
	int rice = 0;
	String name;

	public static void main(String[] args) {
		
		System.out.println("-----大胃王快食比賽開始!-----");
		
		Homework9_1 h1 = new Homework9_1("饅頭人");
		Thread t1 = new Thread(h1);
		
		Homework9_1 h2 = new Homework9_1("詹姆士");
		Thread t2 = new Thread(h2);
		
		try {
			
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("-----大胃王快食比賽結束!-----");
		
	}

	public Homework9_1() {}
	public Homework9_1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		while (rice <= 10) {
			
			System.out.println(name + "吃第" + rice + "碗飯");
			rice++;
			
			try {
				
				int random = (int) (Math.random() * 2500) + 500;
				Thread.sleep(random);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		
		System.out.println(name + "吃完了!");
		
	}
}
