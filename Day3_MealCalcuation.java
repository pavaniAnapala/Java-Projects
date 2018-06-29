package src;

import java.util.Scanner;
public class Day3_MealCalcuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	        
	        // Write your calculation code here.
	        double tipPercent1 = mealCost*((double) tipPercent/100);
	          double taxPercent1 = mealCost*((double) taxPercent/100);
	           double p = mealCost+ tipPercent1 + taxPercent1;
	          // cast the result of the rounding operation to an int and save it as totalCost 
	          int totalCost = (int) Math.round(p);///*numberToRoundHere*/);
	        System.out.println("The total meal cost is "+totalCost + " dollars.");
	}

	             
}
