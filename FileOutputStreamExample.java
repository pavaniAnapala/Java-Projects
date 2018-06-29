package IOPrograms;
import java.io.*;

public class FileOutputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Hello.txt");
			fout.write(65);
			fout.write(66);
			fout.write(67);
		
			String s = "Welcome to my page";
			byte b[]=s.getBytes();//converting string to byte array
			fout.write(b);
			fout.close();
		}
		catch(Exception e){
			System.out.println("System Error");
		}
		System.out.println("Success.....");
	}

}
