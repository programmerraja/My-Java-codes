
/* inheritance in java */

class car1
{
   static int total_speed=100;
   int current_speed=0;
   
   void start (){
     System.out.println("car is started !");
     current_speed+=20;
   }
   
   void accelerate()
   {
     current_speed+=10;
   }
  
  int get_speed()
  {
    return current_speed;
  }
  
  void breaks(){
    System.out.println("car is stopped!!!");
    current_speed=0;
  }
}

class car2 extends car1
{

   static int total_speed=200;
   
  void startfm(){
    System.out.println("FM is started !");
  }
  
}


public class oops {


  public static void main(String[] args) {
  
  car2 bmw =new car2();
  bmw.start();
  bmw.accelerate();
  System.out.println("car speed is "+bmw.get_speed());
   bmw.accelerate();
  System.out.println("car speed is "+bmw.get_speed());
  bmw.startfm();
  bmw.breaks();
  }

}
