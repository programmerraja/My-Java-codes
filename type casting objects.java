
/*
type casting object in java 
*/
public class typecaste {

  public static void main(String[] args) {
  parent objp=new child();
  
  
  System.out.println(objp.age);
  child objc=(child)objp;
  
  objc.ride();
   System.out.println(objc.age);

  }

}
class parent 
{
int age=70;

void ride()
{
System.out.println("slow and steady!!");

}
}

class child extends parent 
{
int age=20;
void ride()
{
System.out.println("fast hurry!!");

}
}

