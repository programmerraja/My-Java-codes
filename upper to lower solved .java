
// debuged by Raja 
import java.util.Scanner;
class Sample1
{
    void Sample2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper value:");
        char a = sc.next().charAt(0);
        //we need explicitly type cast 'a'(var) to integer 
        int b = ((int)a)+32;
        System.out.println((char)b);
        
    }
}
class Sample
{
    public static void main(String args[])
    {
        Sample1 s = new Sample1();
        s.Sample2();
    }
}