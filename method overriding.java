/* 

2.run time polymorphism  -> method overriding 


*/
public class polymorphism {



  public static void main(String[] args) {
    
    parent objp= new child();
    
    objp.riding(5);


  }

}

class parent
{
void riding(int b)
{
System.out.println("slow and steady ");
}
}
class child extends parent 
{
void riding(int a)
{

System.out.println("fast hurry!!!!!");

}
}


