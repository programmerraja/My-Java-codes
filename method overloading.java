
/* polymorphism in java 


1.compile time ->method overloading 
2.run time. -> method overriding 


*/

import com.tamilprogrammers.polymorphism;
import java.util.Scanner;


public class polymorphism {


static int bike_no[]={765,986,367,996,543};
  
  static String  name[]={"jack","smith" ,"rock","James","raju"};



static String  search_bike(int no )
{
  for(int i=0;i<polymorphism.bike_no.length;i++)
  {
    if(no==polymorphism.bike_no[i]){
      return polymorphism.name[i];
    }}
  
  //System.out.println("Data not found ");
  return "not found ";
  
}
static int search_bike(String na)
{
  for(int i=0;i<polymorphism.name.length;i++)
  {
    if(na.equals(polymorphism.name[i])){
      return polymorphism.bike_no[i];
    }
  }
 // System.out.println("data not found ");
  return 0;
  
}



public static void main(String a[])
{
 int ch;
 int no;
 String na;

  Scanner obj=new Scanner(System.in);
  
  System.out.println("how do you going to search 1.bike no \n 2.name ");
  ch=obj.nextInt();
  if(ch==1)
  {
  System.out.println("enter the bike no ");
  no=obj.nextInt();
    System.out.println("the owner of bike is "+search_bike(no));
  }
  
   else if(ch==2)
  {
  System.out.println("enter the owner name  ");
  na=obj.next();
    System.out.println("the   bike number  is "+search_bike(na));
  
  
}
}
}

