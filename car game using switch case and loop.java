
import java.util.Scanner;


/*
control statement in java

1.if else 
2.for 
3.while do while 
4.switch

keywords 


5.break and continue 
*/
public class controls {

  public static void main(String[] args)
  
   {
   Scanner obj=new Scanner(System.in);
   
   char in;
   do
   {
   System.out.println("enter the instruction");
    in=obj.next().charAt(0);
  switch(in){
    case 'r':{
      
      System.out.println("car turn right ");
      break ;
      
    }
    case 'l':
    {
      System.out.println("car turn left  ");
      break;
      
      
    }
    case 's':
    {
      System.out.println("car speed up!! ");
      break;
      
    }
    
    case 'b':
    
    {
      System.out.println("car stoped");
      break;
   
    }
    default:
    {
      System.out.println("not a valid key ");
    }
  }
}
while(in!='e');

System.out.println("game exit ");

}

}