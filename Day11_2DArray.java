package src;

import java.util.Arrays;
import java.util.Scanner;
public class Day11_2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
				
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print("Enter "+ i + " and  "+ j +" values:" );
				arr[i][j]=scan.nextInt();
				} 
			}
		
		int highSum =Integer.MIN_VALUE;
		int sum =0;
		int arr1[] = new int[7];
		for(int k=0;k<4;k++){
			for(int p=0;p<4;p++){
				sum =arr[k][p]+arr[k][p+1]+arr[k][p+2]
						+arr[k+1][p+1]
						+arr[k+2][p]+ arr[k+2][p+1]+arr[k+2][p+2];
				if(sum>highSum ){
					highSum = sum;
					arr1[0]= arr[k][p];
					arr1[1]=arr[k][p+1];
					arr1[2] =arr[k][p+2];
					arr1[3]= arr[k+1][p+1];
					arr1[4] = arr[k+2][p];
					arr1[5]= arr[k+2][p+1];
					arr1[6]=arr[k+2][p+2];
				}
		}

	}scan.close();
	System.out.println("Maximum sum is..:"+highSum);
 System.out.println("The hourglass with maximum sum is..");
 for(int i=0;i<7;i++){//System.out.print(arr1[i]+ " ");
 if(i<3){System.out.printf(" %d ",arr1[i]);}
 else if(i==3){System.out.printf("\n    %d \n",arr1[i]);}
 else {System.out.printf(" %d ",arr1[i]);};

	 	}
 	}
}

