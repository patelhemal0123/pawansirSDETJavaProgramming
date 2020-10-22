package pawansirSDETJavaProgramming;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		
		//Approach1 - Random
		
		//Random rand=new Random();
		
		// int rand_int=rand.nextInt(1000);
		// System.out.println(rand_int);
		
		//double rand_dbl=rand.nextDouble(); //range from 0.0 and less than 1.0
		//System.out.println(rand_dbl);
		
		//Approach 2 - Math
		//System.out.println(Math.random());
		
		//Approach 3 - Apache commons - lang API
		
		//String randNum=RandomStringUtils.randomNumeric(10);
		//System.out.println(randNum);
		
		String ranStr=RandomStringUtils.randomAlphabetic(20);
		System.out.println(ranStr);
				
	}

}
