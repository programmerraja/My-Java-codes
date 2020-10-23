// Created by Mr._Slayer_OfficiaL
//debug by raja 

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
int counter=5;//counter value need to intialize 
        Scanner obj=new Scanner(System.in);
        String[] names=new String[counter];
        for(int i=0;i<counter;i++)
    {
        names[i]=obj.next();//i value need to incremaent 
    }
    for(int i=0;i<counter;i++)
    {
        System.out.println(names[i]);//need to use i 
    }
    }
    
}