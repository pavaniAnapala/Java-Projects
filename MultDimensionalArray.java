package Misc;

public class MultDimensionalArray {

	int a[][]={{1,1,1},{2,2,2},{3,3,3}};
	void disp(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println(" ");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[][]={{1,1,1},{2,2,2},{3,3,3}}; //array decalration and initialising
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}System.out.println(" ");
		}*/
		MultDimensionalArray s= new MultDimensionalArray();
		s.disp();
		System.out.print(s.getClass());
	}
	
	

}
