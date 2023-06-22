package animal;

import java.util.ArrayList;

public class Dog extends Animal{
	private ArrayList<dogggg> dog;
	
	public Dog() {
		this.dog = new ArrayList<dogggg>();
	}
	

	public Dog(ArrayList<dogggg> dog) {
		this.dog = dog;
	}

	public void insert(dogggg d) {
		this.dog.add(d);
	}
	@Override
	public int eat() {
		int max = 0, dem=0, i=0;
		for (dogggg d : dog) {
			i++;
			if(d.getName().length() > max) {
				max = d.getName().length();
				dem=i+1;
			}
		}
		return dem;
	}

	@Override
	public void sleep() {
		double med, a=0;
		for (dogggg d : dog) {
			a += d.getWeight();
		}
		med = a/dog.size();
		for (dogggg d : dog) {
			if(d.getWeight() > med && d.getName().equalsIgnoreCase("den") ) {
				System.out.println(d);
			}
		}
	}

	@Override
	public double sing() {
		// TODO Auto-generated method stub
		double total=0;
		for (dogggg d : dog) {
			if(d.getColor().equalsIgnoreCase("nau")) {
				total+=d.getWeight();
			}
		}
		return total;
	}

}
