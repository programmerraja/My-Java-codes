
/* Types of Variable in java 

1.local 
2.static
3.instance 

*/


public class game {

public static void main(String a[])
{

  running_game player1=new running_game("p1");
  
  running_game player2=new running_game("p2");
  
  
  player1.run();
  player2.run();
}


}

class running_game
{

    //instance var 
   String name;
   
   //static var 
   static int total_distance=100;
   running_game(String n)
   {
     name=n;
   }
   
   
   static void run()
   {
      //local var 
     int health=100;
     System.out.println("health is "+health);
     for( int i=0;i<=running_game.total_distance;i+=5)
     {
       System.out.println("distanced covered is" +i);
       health-=5;
       
     }
     System.out.println("the final health is "+health);
     
     
     
   }
  
  
}
