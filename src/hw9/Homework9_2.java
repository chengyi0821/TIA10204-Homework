package hw9;

public class Homework9_2 {
	
	public static void main(String[] args) {
		
		MotherChild motherChild = new MotherChild();
		Mother mother = new Mother(motherChild);
		Child child = new Child(motherChild);
		
		mother.start();
		child.start();
		
		try {
			
			mother.join();
			child.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
}