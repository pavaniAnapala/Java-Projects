/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankPrograms;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class StringCOncat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2= scan.nextLine();
        
        
        /*Hi import java.util.*; is there. The * means that all the classes 
        under util package which includes Scanner will be available in this 
        code. scan.nextInt leaves an empty line space at the end so you 
        need to add scan.nextLine to comsume that empty line space,
        then add another scan.nextLine to take the actual string.*/
        //String s1 = scan.next()+scan.nextLine(); refer hackerRank Program
        System.out.println("Entered Strings are:");
        System.out.println(s1+s2);
        }}

