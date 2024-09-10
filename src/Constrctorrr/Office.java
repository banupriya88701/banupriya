package Constrctorrr;

public class Office {
	
	public Office() {
		System.out.println("Default parameters");
	}
	public Office(int id,String name) {
		System.out.println("Parameter passed:"+" " +id+", " + name);
	}

	public static void main(String[] args) {
		Office o=new Office();
		Office i=new Office(12,"SLA");
		

	}

}
