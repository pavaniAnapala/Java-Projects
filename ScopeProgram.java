package HackerRankPrograms;
import java.util.Scanner;
import java.lang.*;
class Difference{
	private int[] elements;
	public int maxDif;
	Difference(int[] elements){
		this.elements = elements;
	}
	void computeDif(){
		
		int min=100;
		int max=1;
		
		for(int j=0;j<elements.length;j++){
		max=Math.max(max,elements[j]);
		min= Math.min(min,elements[j]);}
		//if(elements[j]>max){max=elements[j];}
		//if(elements[j]<min){min=elements[j];}
		maxDif=max-min;
	}
}
public class ScopeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}scan.close();
		Difference dif = new Difference(a);
		dif.computeDif();
		System.out.println(dif.maxDif);
	}

}	
