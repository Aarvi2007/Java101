
/**
 * Write a description of class LargestNum here.
 * Program to print the maximum number out of 3 input numbers
 * @author (Arvi)
 * @version (a version number or a date)
 */
   

import java.util.Scanner; 
public class LargestNumber
{   
     public static void main(String args[]) 
     {
            int num1=0,num2=0,num3=0;
            int largest=0;
            //Scanner class to take user input.
            Scanner X = new Scanner(System.in);
             
            System.out.print("Enter First No. :");
            num1 = X.nextInt(); //read integer number
             
            System.out.print("Enter Second No. :");
            num2 = X.nextInt(); //read integer number
             
            System.out.print("Enter Third No. :");
            num3 = X.nextInt(); //read integer number
             
            if( num1 > num2 && num1 > num3)
                largest = num1;
            else if(num2 > num1 && num2 > num3)
                largest = num2;
            else
                largest = num3;
             
            System.out.println("Lagest Number is : "+largest);
     }
}