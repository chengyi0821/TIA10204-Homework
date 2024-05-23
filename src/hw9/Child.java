package hw9;

public class Child extends Thread {

	MotherChild child;

	public Child() {}

	public Child(MotherChild child) {
		
		this.child = child;
		
	}

	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			child.child(1000);
		}
		
		child.finished = true;
		
	}
}
