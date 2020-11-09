// Created by Coding Beginner

//errors in this program

//debug by raja 
public class ParameterPassing
{
    public static void main(String[] args) {
    int sum=Add(700,600);
   int result=sum/100;
   //result is local var so it only accessbile inside a function 
   System.out.println(result);
    }
    
    //function cannot have two return type 
    public static int Add(int a,int b)
    {
        
        return(a+b);
        }
        
        
    
}