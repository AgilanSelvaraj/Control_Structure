package control_structure.Assignment_1;

import java.util.Scanner;

public class EligbilityToVote {
	
	public static void main (String[] args){
				
		System.out.println("Please enter your age: ");
		Scanner input_age = new Scanner(System.in);
		int age = input_age.nextInt();
		
		if(age>=18){
			System.out.println("You are eligible to vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
		
	}
		


}
