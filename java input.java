

import java.util.Scanner;
public class myclass 
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       float b=sc.nextFloat();
       String s=sc.next();
       char c=sc.next().charAt(0);
       System.out.println("you entered num :" +a);
       System.out.println("you entered float :" +b);
       System.out.println("you entered string :" +s);
       
       System.out.println("you entered char :" +c);
       
       
       
    }
}