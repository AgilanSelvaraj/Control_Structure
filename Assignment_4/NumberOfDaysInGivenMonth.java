package control_structure.Assignment_4;

import java.util.Scanner;

public class NumberOfDaysInGivenMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input the Month's number of the year");
		Scanner input_month = new Scanner(System.in);
		int month = input_month.nextInt();
		
		switch(month){
		case 1:
			System.out.println("January has 31 days");
			break;
		
		case 2: 
			System.out.println("Feb has 28 days");
			break;		
		
		case 3:
			System.out.println("March has 31 days");
			break;
		
		case 4:
			System.out.println("April has 30 days");
			break;
		}

	}

}
