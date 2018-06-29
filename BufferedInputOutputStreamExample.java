package IOPrograms;
import java.io.*;
public class BufferedInputOutputStreamExample {

		public static void main(String[] args){
			try{
				
				FileOutputStream fout = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Hello1.txt");
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				String str = "Jai Ganesha...!";
				byte b[]=str.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				fout.close();
					
			}
			catch(Exception e){
				System.out.println("Buffered Output error");
			}
			System.out.println("Buffered Output Success");
			try{
				FileInputStream fin = new FileInputStream("C:\\Users\\Asus\\Desktop\\Hello1.txt");
				BufferedInputStream bin = new BufferedInputStream(fin);
				int i;
				while ((i=bin.read())!=-1){
					System.out.print((char)i);
				}
				bin.close();
				fin.close();
				
				}
			catch(Exception e1){
				System.out.println("Buffered Input Error..");
			}
			System.out.println("\nBuffered Input Success...!");
		}
}
