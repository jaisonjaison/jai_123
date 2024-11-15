package javaproject;

public class B {

	public static void main(String[] args) {
		int a=2;
		int b=4;
try {
	
	System.out.println(a/0);
	System.out.println(b/a);
}
catch (ArithmeticException e) {
	// TODO: handle exception
}{
	
}
System.out.println(a+b);
	}

}
