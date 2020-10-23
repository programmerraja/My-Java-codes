
/*
import java .lang.String ;
class String 
{
  .....
}*/


public class strings {

  public static void main(String[] args) {
  
   String name =new String("java");
   
   String name2 =new String(" is easy ");
   System.out.println("your name is "+(name.toUpperCase()));
   System.out.println(name );
   
   System.out.println("your name is "+(name.toLowerCase()));
   
   System.out.println("char at pos 2 "+name.charAt(2));
   
  System.out.println("name from 2 to 3 is "+name.substring(2,3));
   
   System.out.println("length of your  name is "+(name.length()));
    System.out.println(name.equals(name2
    ));
    
   
    System.out.println("index of a is "+name.indexOf('a'));
    
    
    System.out.println("name +name1="+name.concat(name2));
    
    
    System.out.println("replacing a with r is "+name.replace('a','r'));
    
    
    System.out.println("ends with va ?"+name.endsWith("va="));
  }

}
