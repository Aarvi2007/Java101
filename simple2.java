
/**
 * Program for SIMPLE INTEREST CALCULATION 
 *
 * @author Aarvi
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class simple2
{
    public static void main (String hate[])
    {
        float p,r,t ,SI;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the principal:");
        p=sc.nextFloat();
        System.out.print("enter the rate:"); 
        r=sc.nextFloat();
        System.out.print("enter the time:");
        t=sc.nextFloat();
        System.out.println("Principal is :" +p);
        System.out.println("Rate  is :" +r);
        System.out.println("Time  is :" +t);
        SI=(p*r*t)/100;
        System.out.println("SIMPLE INTEREST:" +SI);
        
    }
}
