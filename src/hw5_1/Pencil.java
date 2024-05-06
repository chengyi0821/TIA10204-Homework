package hw5_1;

public class Pencil extends Pen {
	public Pencil() {
	};

	public Pencil(String brand, double price) {
		super(brand, price);
	}

	@Override
	public void write() {
		super.write();
		System.out.println("削鉛筆再寫");
	}

	public double getPrice() {
		return super.getPrice() * 0.8;

	}
}
