
/**
 * Write a description of class SI here.
 * Program to calculate Simple Interest
 * @author (Arvi)
 * @version (a version number or a date)
 * 
 */

import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        //String s="gauri"+" is here";
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest (P x R x T)/100 is : " +sinterest);
    }
}