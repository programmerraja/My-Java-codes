
import java.util.Scanner;

public class Inputdemo {

  public static void main(String[] args) {
  
    Scanner obj =new Scanner(System.in);
    
   int age;
   float height;
   String name;
   double weight ;
   char letter ;
   
   
   
   System.out.println("Enter your age ");
   age=obj.nextInt();
  
  System.out.println("Enter your height ");
  height=obj.nextFloat();
  
  System.out.println("Enter your weight");
  
  weight=obj.nextDouble();
  
  
  System.out.println("Enter your name  ");
  
  name=obj.next();
  
  
  System.out.println("Enter any char ");
  
  letter=obj.next().charAt(0);
  
  System.out.println("your name is "+name );
  
  
  System.out.println("your age is "+age );
  
  System.out.println("your height is "+height);
  
  System.out.println("your weight is "+weight );
  
  
  
  System.out.println("your char  is "+letter );
  
  
  }

}
