/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankPrograms;

import java.util.*;

class Calculator {
int power(int a, int b) throws Exception{
    if(a<0 || b<0){
        throw new Exception("n and p should be non-negative");
    }
    else{return ((int)Math.pow(a, b));
        
    }
        
}}

  public class ExceptionCalculator {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n= scan.nextInt();
      while(n-- >0){
          int p = scan.nextInt();
          int x = scan.nextInt();
          Calculator calc = new Calculator();
          try{
            int ans = calc.power(p,x);
            System.out.println(ans);
          }catch(Exception e){
          System.out.println(e.getMessage());
      }
      }
  }  
}
