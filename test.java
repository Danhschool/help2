package animal;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog dogg = new Dog();
		for(int i=0; i<5; i++) {
			
		// m sửa dc nhập chữ sau khi nhập số là ổn nha :)
			System.out.println("Name"); String n = sc.nextLine();
			System.out.println("Weight"); double w = sc.nextDouble();
			System.out.println("Color"); String c = sc.nextLine();
			dogggg d = new dogggg(n,w,c);
			dogg.insert(d);
		}
		dogg.eat();
		dogg.sleep();
		dogg.sing();
		
		Cat catt = new Cat();
		for(int i=0; i<5; i++) {
			System.out.println("Name"); String n = sc.nextLine();
			System.out.println("Weight"); double w = sc.nextDouble();
			System.out.println("Type"); int t = sc.nextInt();
			catttt c = new catttt(n,w,t);
			catt.insert(c);
		}
		catt.eat();
		catt.sleep();
		catt.sing();
	}
}