package hw5_1;

public class Penmain {
	public static void main(String[] args) {
		Pen[] p = new Pen[2];
		p[0] = new Pencil("pencil", 1000);
		p[1]= new InkBrush("InkBrush", 1000);
		for(int i = 0;i <= 1;i++) {
			System.out.println("=========================");
			System.out.println("定價:" + p[i].getPrice());
			p[i].write();
		}
	}
}
