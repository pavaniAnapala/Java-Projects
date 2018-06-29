package HackerRankPrograms;
import java.util.*;
public class typeCastingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	double mealCost = scan.nextDouble();
	int tipPercent = scan.nextInt();
	int taxPercent = scan.nextInt();
	scan.close();
	double b = mealCost*((double) tipPercent/100);
	double b1 = mealCost*((double) taxPercent/100);
	System.out.println("Meal Cost is ...:"+ mealCost);
	System.out.println("Tip Percent is ...:"+b);
	System.out.println("Tax Percent is ...:"+ b1);
	//(int)Math.round
	double p= mealCost + b+b1;
	//double p=( (mealCost+(mealCost *( (double)(tipPercent/100)))+(mealCost *((double) (taxPercent/100)))));
	System.out.println("The total meal cost is "+ (int)Math.round(p) + " dollars");
	}

}
