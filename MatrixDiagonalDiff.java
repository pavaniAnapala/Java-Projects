/*The first line contains a single integer n, 
. The next lines denote the matrix's rows(n*n), with each line containing 
space-separated integers describing the columns.*/

package HackerRankAlgorithms;

import static java.lang.Math.abs;
import java.util.Scanner;

public class MatrixDiagonalDiff {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] tab = new int[n][n];
        int diag1Sum = 0;
        int diag2Sum =0;
        int diff=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tab[i][j]= scan.nextInt();
                if(i==j){
                    diag1Sum = diag1Sum+tab[i][j];
                }
                if(i+j == n-1){
                    diag2Sum = diag2Sum + tab[i][j];
                }
            }
        }
        System.out.println(diag1Sum +"  " + diag2Sum);
        diff = abs(diag1Sum - diag2Sum);
        System.out.println(diff);
    }
}
