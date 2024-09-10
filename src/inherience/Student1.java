package inherience;
//child class
public class Student1 extends College {
public void name() {
	System.out.println("Priya");
}
public void id() {
	System.out.println("123");
}
public static void main(String []args) {
	
	Student1 s=new Student1();
	s.collegeAdress();s.collegeName();
	s.name();
	s.id();
	
}
	
}
