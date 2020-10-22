package pawansirSDETJavaProgramming;

public class ReverseString {

	public static void main(String[] args) {
		
		//1) Using + (String concatenation) operator
		
		String str="ABCD";
		String rev="";
		
		/*int len=str.length();	//4
		
		for(int i=len-1;i>=0;i--)	//3	2	1	0	-1
		{
			rev=rev+str.charAt(i);	//D	DC	DCB	DCBA
		}
		*/
		
		
		//2) Using character array
		
		/*char a[]=str.toCharArray();
		int len=a.length;	//4
		for(int i=len-1; i>=0; i--)	//3	2	1	0
		{
			rev=rev+a[i];	//D	DC	DCB	DCBA
		}*/
		
		
		//3) Using String Buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse string is: "+ sb.reverse());
	}

}
