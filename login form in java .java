//created by coding beginner 
//debug by raja 

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
    int psword1;
    psword1 =12345;
    String username1="java";

  Scanner sc=new Scanner (System.in);
    int psword2 =sc.nextInt();
 String   username2 =sc.next(); 
 
 
    if(psword1 == psword2 && username1.equals( username2 ))
         {
             System.out.println("login ok");
         }
         if(psword1!=psword2 || !username1.equals (username2 ))
         {
             System.out.println("entered wrong one");
         }
         
            }}