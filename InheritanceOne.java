package HackerRankPrograms;
import java.util.*;
class person{
	
	protected String firstName,lastName;
	protected int identification;
	
	person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.identification = identification;
	}
	public void printPerson(){
		System.out.println("Name:" + lastName+" ,"+firstName + "\nID"+ identification);
	}
}
class student extends person{
	//String firstName,lastName;
	//int id;
	private int[] testScores;
	student(String firstName,String lastName,int id, int[] testScores){
	super(firstName, lastName, id);
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.id=id;
		this.testScores=testScores;
	}
	char calculate(){
		System.out.println("Welcome to calcuate method");
		int avg=0, total =0;
		for(int i=0;i<testScores.length;i++){
			total = total+ testScores[i];
		}avg = total/testScores.length;
		if(avg>= 90 & avg <= 100){
			return 'O';
			}
		else if(avg>= 80 & avg <= 90){
			return 'E';
		}
		else if(avg>= 70 & avg <= 80){
			return 'A';
		}
		else if(avg>= 55 & avg <= 70){
			return 'P';
		}
		else if(avg>= 40 & avg <= 55){
			return 'D';
		}
		else if(avg< 40){
			return 'T';
		}
		return 'T';
		
	}
}
public class InheritanceOne {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String firstName = scan.next();
		String lastName = scan.next();
		int id= scan.nextInt();
		System.out.println("FIrst Name "+ firstName);
		int numScores = scan.nextInt();
		System.out.println("Number of Scores "+ numScores);
		int[] testScores = new int[numScores];
		for(int p=0;p<numScores;p++){
			testScores[p]=scan.nextInt();
			
		}
		student s1 = new student(firstName,lastName,id,testScores);
		s1.printPerson();
		char st=s1.calculate();
		System.out.println(st);

	}

}
