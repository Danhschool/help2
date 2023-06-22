package animal;

public class dogggg {
	private String name;
	private double weight;
	private String color;
	
	public dogggg(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "dogggg [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}
}
