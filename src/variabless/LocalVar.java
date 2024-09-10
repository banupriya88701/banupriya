package variabless;

public class LocalVar {

	int a=100;
	public void var() {
		System.out.println("A is value pass:"+a);
	}
	public static void main(String[] args) {
		int a=50;
		
		System.out.println("A is before main methos:"+a);
		LocalVar l=new LocalVar() ;
		l.var();
		}

}
