package animal;

import java.util.ArrayList;

public class Cat extends Animal{
	private ArrayList<catttt> cat;
	
	
	public Cat() {
		this.cat = new ArrayList<catttt>();
	}
	public void insert(catttt d) {
		this.cat.add(d);
	}
	@Override
	public int eat() {
		int total=0;
		for (catttt c : cat) {
			if(c.getType()==1) {
				total++;
			}
		}
		return total;
	}

	@Override
	public void sleep() {
		int med, a=0;
		for (catttt c : cat) {
			a+=c.getWeight();
		}
		med = a/cat.size();
		for (catttt c : cat) {
			if(c.getWeight()<med) {
				int b = c.getName().length();
				String d = c.getName().substring(b/2), e = c.getName().substring(b/2, b);
				String f = d + " GO " + e;
				c.setName(f);
			}
		}
		for (catttt c : cat) {
			System.out.println(c);
		}
	}

	@Override
	public double sing() {
		int type1= 0;
		for (catttt c : cat) {
			if(c.getType() == 1) {
				type1 ++;
			}
		}
		double s = (cat.size()/type1);
		return s;
	}

}
