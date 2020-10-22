package pawansirSDETJavaProgramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach 1 Using FileReader BufferReader
		
		/*FileReader fr=new FileReader("C:\\Users\\hpatel\\Selenium\\Test.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		//Approach 2 : Using Scanner & File
		
		File file=new File("C:\\Users\\hpatel\\Selenium\\Test.txt");
		Scanner sc=new Scanner(file);
		
		//loop statement
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3
		sc.useDelimiter("\\z");
		System.out.println(sc.next());		
	}
}
