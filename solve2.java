// Created by Coding Beginner

import java.util.Scanner;
public class Switch
{
    public static void main(String[] args) {
    int num,a, b;
    Scanner sc = new Scanner(System.in);
    
    System.out.println ("1.addtion 2.sub 3.div 4.mul ");
    num = sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    switch(num)
    {
        case 1:
        System.out.println(a+b);
        break;
        case 2:
        System.out.println(a-b);
        break;
         case 3:
        System.out.println(a/b);
        break;
         case 4:
        System.out.println(a*b);
        break;
        default:
        System.out.println("out of range ");
        break;
    }
    
   }
}