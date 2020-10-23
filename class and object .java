
/* class and object in java */

public class car {

  int speed;
  
  
  public static void main(String[] args) {
  
  car BMW =new car();
  BMW.speed=200;
  
  System.out.println("BMW car speed is "+BMW.speeds());
  
  car Ferrari =new car();
  Ferrari.speed=250;
  
  System.out.println("Ferrari  car speed is "+Ferrari.speeds());
  
  }
  
  
  int speeds()
  {
    return speed;
  }
  

}
