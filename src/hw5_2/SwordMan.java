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
		System.out.println("揮劍!");
	}
}
