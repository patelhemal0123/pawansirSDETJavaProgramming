package pawansirSDETJavaProgramming;

import java.lang.reflect.Array;

public class EvenOddfromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		//Extracting even numbers...............
		
		System.out.println("Even numbers in Array :");
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
				
		}*/
		
		
		//Enhanced for loop
		
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd numbers in Array :");
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
				
		}*/
		
		//Enhanced for loop
		
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
				
	}
}

