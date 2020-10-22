package pawansirSDETJavaProgramming;

public class CountCharachterOccurance {

	public static void main(String[] args) {
		
		String s="Java Programming aaaa Java oops";
		
		int totalcount=s.length();	// total length 
		
		int totalcount_afterRemove= s.replace("J", "").length();	// total length after removing a's
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("Number of occurances of a is: "+count);
		
	}

}
