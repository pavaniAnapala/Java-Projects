class Animal{
	
}
public class DownCastingExample extends Animal{
 static void method(Animal a){
	 if(a instanceof DownCastingExample){
		 DownCastingExample d = (DownCastingExample)(a);//downCasting
		 System.out.print("DownCasting performed...Ok..");
	 }
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= new DownCastingExample();
		DownCastingExample.method(a);
		
	}

}
