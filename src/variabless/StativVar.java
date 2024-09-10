package variabless;

public class StativVar {
	private static int a;
	public void sample() {
		int a=100;
		System.out.println("A is after methods: "+a);
	}
	

	public static void main(String[] args) {
		int a=60;
		StativVar s= new StativVar();
		s.sample();
		System.out.println("A is after object creation:"+a);
		
	}

}
