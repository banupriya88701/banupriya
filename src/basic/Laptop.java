package basic;

public class Laptop {
	public void Model1() {
		System.out.println("Dell");
	}
	public void Model2() {
		System.out.println("Lenova");
	}
	public void Model3() {
		System.out.println("Apple");
	}
	public void Model4() {
		System.out.println("Acer");  
	}
	public static void main(String[]args) {
		Laptop l=new Laptop();
		l.Model1();
		l.Model2();
		l.Model3();
		l.Model4();
	}

}
