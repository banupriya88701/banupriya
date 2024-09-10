package stringggg;

public class Task {
	
	public static void main(String[]args) {
		String s="Welcome to Sla Institute";
		
		int  i=s.indexOf("t",9);
		System.out.println(i);
		
		int n=s.indexOf("t",19);
		System.out.println(n);
		
		int a= s.length();
		System.out.println(a);
		boolean b= s.startsWith("E");
		System.out.println(b);
	boolean e = s.endsWith("e");
		System.out.println(e);
		int d=s.indexOf("i");
		System.out.println(d);
	String s2 = s.toLowerCase();
	System.out.println(s2);
	String u = s.toUpperCase();
		System.out.println(u);
		int  s3 = s.lastIndexOf('t');
		System.out.println(s3);
	}
	

}



  






