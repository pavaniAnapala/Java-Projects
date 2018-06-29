package StringPrograms;

public class CompareString1 {

	
	public static void main(String[] args) {
		String s1= "Pavani";
		String s2="Pavani";
		String s3= new String("Pavani");
		String s4="Chinni";
		String s5="PAVANI";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println(s1.equalsIgnoreCase(s5));
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s4));
		System.out.println(s2.compareTo(s5));
		System.out.println(s2.compareToIgnoreCase(s5));
	}

}
