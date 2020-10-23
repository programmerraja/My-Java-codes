// Created by Coding Beginner


import java.io.*;
public class Switch
{
    public static void main(String[] args)throws Exception  {
    int num;
    BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));
    num = Integer.parseInt(br1.readLine());
    switch(num)
    {
        case 1:
        System.out.println("php is best");
        break;
        case 2:
        System.out.println("java best");
        break;
        default:
        System.out.println("both are best");
        break;
    }
    
   }
}