package inherience;

public class Student2 extends College{
	public void no() {
		System.out.println("564");
	}
	public static void main(String[]args) { 
		
		Student2 t= new Student2();
		t.collegeAdress();t.collegeName();
		t.no();
	}

}
