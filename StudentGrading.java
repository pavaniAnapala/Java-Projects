

package HackerRankAlgoImpl;
import java.util.*;

public class StudentGrading {
    public static int[] solve(int[] grades){
        int[] finalGrade= new int[grades.length];
        for(int i=0;i<grades.length;i++){
            int reminder = grades[i]%5;
            int divisor = grades[i]/5;
            if((reminder==0)| (grades[i]<40)){
                finalGrade[i]=grades[i];
            }
            if((grades[i]>=38)&(reminder != 0)){
                int roundNum = (divisor+1)*5;
                int diff=roundNum-grades[i];
                if(diff <3){
                    finalGrade[i]=roundNum;
                }
                else{
                    finalGrade[i]=grades[i];
                }
            }
        }
        
        return finalGrade;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int[] a=new int[n];
        //enter n no of students.
        //enter marks for each students.as usaul should be less than 100
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int[] result = solve(a);
        for(int j=0;j<result.length;j++){
            System.out.println(result[j]);
        }
        
    }
}
