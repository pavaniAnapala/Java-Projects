package src;

import java.util.Scanner;
public class Day4_ClassInstance {
	static int age;
	public Day4_ClassInstance(int initialAge) {
		// TODO Auto-generated constructor stub
		if(initialAge <0){
			age =0  ; System.out.println("Age is not valid, setting age to 0.");
		}
		else
			age =initialAge;
	}
	private void amIOld() {
		if(age<13) System.out.println("You are young.");
		else if( age>=13 & age<18) System.out.println("You are a teenager.");
		else System.out.println("You are old.");
		
	}
	private void yearsPasses() {
		// TODO Auto-generated method stub
		age++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0;i< T;i++){
			int age = scan.nextInt();
			Day4_ClassInstance p= new Day4_ClassInstance(age);
			p.amIOld();
			for(int j=0;j<3;j++){
				p.yearsPasses();				
			}
			p.amIOld();
			System.out.println();
			
		}scan.close();
	}
	



}
