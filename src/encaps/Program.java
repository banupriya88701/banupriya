package encaps;

class encapsulation{
	private int age=20;
	private String name="Banu";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Program {

	public static void main(String[] args) {
		
		encapsulation e=new encapsulation();
		e.setName("priya");
		e.setAge(25);
		
		System.out.println(e.getAge()+", "+e.getName());
		

	}

}
