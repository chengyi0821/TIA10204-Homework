package hw9;

public class Mother extends Thread {

	MotherChild mother;

	public Mother() {}
	
	public Mother(MotherChild mother) {
		
		this.mother = mother;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {		
			mother.mother(2000);			
			if(mother.finished){
				break;
				
			}
			
		}
	}
}
