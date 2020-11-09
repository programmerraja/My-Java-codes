

/* multilevel inheritance in java */

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

class car3 extends car2
{
  void startAc(){
    System.out.println("Ac is started !!!");
  }
  
}



public class oops {


  public static void main(String[] args) {
  
   car3 ferrari = new car3();
   ferrari.start();
   System.out.println(ferrari.get_speed());
   ferrari.accelerate();
   ferrari.accelerate();
   System.out.println(ferrari.get_speed());
   ferrari.startfm();
   ferrari.startAc();
   ferrari.breaks();
   
   
   
   System.out.println("total speed "+car3.total_speed);
 
 
  }

}
