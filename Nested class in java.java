

/* Nested class in java

    1.non static 
    2.static 
    3.local 
    4.anonymous 
    
    
*/

public class nestedclass {

  public static void main(String[] args) {
   
   door obj =new door();
   obj.button();
   door.window obj2 =obj.new window();
   obj2.open_window();
  }

}

class door
{
  private int button_pressed=0;
  void button()
  {
     System.out.println("Button is pressed");
     button_pressed=1;
    
     }
     class window
     {
        void open_window()
        {
           if(button_pressed==1)
           System.out.println("Window is open...");
           }
           }
           }
           
           
           
           
           
           