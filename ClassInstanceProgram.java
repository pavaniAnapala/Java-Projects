package HackerRankPrograms;
import java.util.*;

public class ClassInstanceProgram {
	int age;
	ClassInstanceProgram(int initialAge){
	 if (initialAge>0) 
	 {	 this.age= initialAge;
	 	System.out.println("Age is "+this.age);
	 }
	 else{
		 this.age = 0;
		 System.out.println("Age is not valid, setting age to 0.");
	 }
	 
	}
	void yearPasses(){
	this.age++;	
	}
	void amIOld(){
		if(this.age <13){
			System.out.println("You are young.")	;
		}
		else if(this.age>=13 & age<18){
			System.out.println("You are a teenager.");	
		}
		else{
			System.out.println("You are old.");	
		}
		
		}
	
	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 int T =scan.nextInt();
		 for(int i=0;i<=T;i++){
			 int age = scan.nextInt();                                   
			 ClassInstanceProgram p = new ClassInstanceProgram(age);
			 p.amIOld();
			 for(int j=0;j<3;j++)
			 {
				p.yearPasses(); 
			 }
			 p.amIOld();
			 System.out.println();
			 
		 }scan.close();
			
		}

	}

