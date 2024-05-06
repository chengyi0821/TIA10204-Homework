package hw5_2;

public class SwordMan extends Hero {
	@Override
	public void display() {
		System.out.println("move:" + move + "\ndefend:" + defend);
	}

	public SwordMan() {
		super();
	}

	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("attack:" + "揮劍");
	}

	@Override
	public void move() {
		System.out.println("跑步");
	}

	@Override
	public void defend() {
		System.out.println("做防禦動作");
	}

}
