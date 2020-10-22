package pawansirSDETJavaProgramming;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are .. "+a+"  "+b);
		
		//Logic1 - Third variable
		/*int t=a;
		a=b;
		b=t;*/
		
		//Logic2 - use + & - without using 3rd variable
		
		/*a=a+b;  //10+20=30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20*/
		
		//Logic3 - use * and / without using 3rd variable
		//Here a & b values should not be zero
		
		/*a=a*b;	//10*20=200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20*/
		
		//Logic4 - bitwise XOR (^)
		//Website reference for Bitwise converter : http://easyonlineconverter.com/converters/bitwise-calculator.html
		
		/*a=a^b;	//10^20=30
		b=a^b;	//30^20=10
		a=a^b;	//30^10=20*/
		
		//Logic5 - Single statement
		
		b=a+b-(a=b);
		
		System.out.println("After swapping values are .. "+a+"  "+b);
		
	}

}
