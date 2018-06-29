package TrainingClassesPrograms;

public class EvenOdd {

	EvenOdd(){
		System.out.println("Jai Ganesha...!!!");
		System.out.println("Om Namah Shivay...!!!"); 
		System.out.println("Jai Sri Lakshmi Narasimha Swamy...!!!");
	}
	EvenOdd(int a)
	{
		if((a%2)==0){
			System.out.println(a+ " is Even");
		}
		else{
			System.out.println(a+ " is Odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new EvenOdd();
		new EvenOdd(4);
		new EvenOdd(5);
	}

}
