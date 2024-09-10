package Constrctorrr;

public class Client {

	public Client () {
		this("Priya");
		System.out.println("Default cons");
	}
	public Client(String name) {
		this(12);
		System.out.println("Parameter passed:"+name);
	}
	public Client(int id){
		this(false);
		System.out.println(id);
	}
	public Client(boolean name) {
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		Client c=new Client();
		
		
		

	}

}
