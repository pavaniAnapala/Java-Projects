package src;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();
		String us, india,china,france;
		us = (NumberFormat.getCurrencyInstance().format(payment)).toString();
		china = (NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment)).toString();
		france = (NumberFormat.getCurrencyInstance(Locale.FRANCE)).format(payment).toString();
		
		Locale INDIA = new Locale("en","IN");
		india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
		
		System.out.println("US..:" + us);
		System.out.println("India..:"+ india);
		System.out.println("China..."+ china);
		System.out.println("France...:"+ france);
		
	}

}
