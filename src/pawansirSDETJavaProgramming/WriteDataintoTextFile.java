package pawansirSDETJavaProgramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\hpatel\\Selenium\\Test123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		
		System.out.println("Finished!!!!!!!");
		
		bw.close();
	}

}
