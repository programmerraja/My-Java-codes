// Created by For Beginners

/*
This is a small example for an overloaded method. The method test_pw checks if a Pin of integers or a String Password of characers is valid
*/


public class Program
{
    public static boolean test_pw (int pin) {
        if (pin == 4711) {
            return true;
        }
        else {
            return false;
        }
    }
        
    public static boolean test_pw (String password) {
        if (password == "Learn") {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
    
    System.out.print ("Password 1234 is ");
    System.out.println (test_pw (1234));
    
    
    System.out.print ("Password 4711 is ");
    System.out.println (test_pw (4711));
    
    System.out.print ("Password Solo is ");
    System.out.println (test_pw ("Solo"));
    
    
    System.out.print ("Password Learn is ");
    System.out.println (test_pw ("Learn"));
    }
}