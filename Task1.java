package Assignment1;

public class Task1 {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		int c;
		
		System.out.println("Value of a:" +a);
		System.out.println("Value of a:" +b);
		System.out.println("*******************");
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Reverse value of a:" +a);
		System.out.println("Reverse value of a:" +b);

	}

}
