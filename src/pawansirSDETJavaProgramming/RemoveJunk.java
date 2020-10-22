package pawansirSDETJavaProgramming;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="$#%#%%&&^&% testing $%%&$ latin string 0123456789";
		
		s=s.replaceAll("[^a-zA_Z0-9]", "");
		
		System.out.println(s);
	}

}
