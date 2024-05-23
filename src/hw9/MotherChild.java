package hw9;

public class MotherChild {

	private int money = 0;

	public boolean finished = false;

	synchronized public void mother(int inputMoney) {
		while (money > 3000) {
			System.out.println("媽媽看到餘額在3000以上，停止匯款");
			try {
				if(finished){
					break;
				}
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (money == 0)
		System.out.println("媽媽被熊大要求匯款!");
		money += inputMoney;
		System.out.println("媽媽存了" + inputMoney + "，帳戶共有；" + money);
		notify();
	}

	synchronized public void child(int outputMoney) {
		while (money < outputMoney) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (money > 3000)
			System.out.println("熊大被老媽告知帳戶已經有錢!");
		money -= outputMoney;
		System.out.println("熊大領了" + outputMoney + "，帳戶共有:" + money);
		if (money <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
}
