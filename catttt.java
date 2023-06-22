package animal;

public class catttt {
	private String name;
	private double weight;
	private int type;
	public catttt(String name, double weight, int type) {
		this.name = name;
		this.weight = weight;
		this.type = type;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "catttt [name=" + name + ", weight=" + weight + ", type=" + type + "]";
	}
	
}
