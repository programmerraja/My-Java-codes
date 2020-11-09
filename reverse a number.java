
//it work for 4 digit number 
import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
    
    
    int d =4; //set here the no.of  digits.
    
    
    int a[]=new int[d];
    int num=new Scanner(System.in).nextInt();
    int h=0;
    while(num>0)
    {
        a[h]=num%10;
        //it give remainder 
        System.out.println("\nthe reamainder of  " +num+" is  "+a[h]);
    
        num=num/10;
        System.out.println("\n the number is after divide by 10 is" +num);

        h+=1;
    }
    System.out.println("\n the reverse of given number is");
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]);
    }
}