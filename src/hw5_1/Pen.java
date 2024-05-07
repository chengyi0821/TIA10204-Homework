package hw5_1;

public class Pen {
	private String brand;
	private double price;

	public Pen() {}
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void write() {
		System.out.println("品牌:" + brand + "\n價格" + price);
	}
}
