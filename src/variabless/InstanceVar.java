package variabless;

public class InstanceVar {

	
		int a;
		public void name() {
			a=100;
			System.out.println("A is method: "+a);
		}
		
		public static void main(String[] args) {
			 InstanceVar i=new  InstanceVar();
			 i.name();
			 System.out.println("A is after is calling the object: "+i.a);
	}

}
