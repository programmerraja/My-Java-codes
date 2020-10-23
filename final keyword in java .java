
/*
final keyword in java 
var 
method 
class 

*/
public class typecaste {

  public static void main(String[] args) {
    shooter obj=new shooter2();
    
obj.gun();
  }

}
 class shooter
{
void focus ()
{
System.out.println("Gun is focus...");
}

final void gun()
{
System.out.println("Gun is ak47...");
}
}

class shooter2 extends shooter
{
void focus ()
{
System.out.println("Gun is focus...");
}

void gun(int a)
{
System.out.println("Gun is sniper...");
}
}

