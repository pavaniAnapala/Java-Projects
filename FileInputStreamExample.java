package IOPrograms;
import java.io.*;
public class FileInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			FileInputStream fin = new FileInputStream("c:\\Users\\Asus\\Desktop\\Hello.txt");
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)(i));
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("Success...");

	}

}
