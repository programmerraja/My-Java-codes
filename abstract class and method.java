

/* abstract class /method  in java */


public class Abstractclass {

  public static void main(String[] args) {
  enemy obj =new Mike();
  obj.setName("Mike");
  obj.attack();
  
  jack obj1=new jack();
  
  obj1.setName("Jack");
  obj1.attack();

  }

}
abstract class enemy
{

enemy()
{
  System.out.println("Emmet are ahead !!!");
}
String name;
void setName(String na)
{
name =na;
}

abstract void attack();
}

class Mike extends enemy
{

void attack()
{
  System.out.println("my name is "+name+" attack with wood ");
}
}

class jack extends enemy
{
void attack()
{
  System.out.println("my name is "+name+" attack with gun ");
}
}
