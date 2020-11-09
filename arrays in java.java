
import java.util.Scanner;

/*

Arrays in java .



*/


public class arrays {

  public static void main(String[] args) {
  
  System.out.println("hotel room booking ");
  Scanner obj =new Scanner(System.in);
  
  int room_no[]=new int[10];
  for(int i=0;i<room_no.length;i++)
  {
    System.out.println("enter the no of people's in a room "+(i+1));
    room_no[i]=obj.nextInt();
  }
  
  System.out.println("room No.  no of people ");
 
  for(int j=0;j<room_no.length;j++){
    
    
    System.out.println((j+1) +"       "+room_no[j]);
  }
 
  

  }

}
