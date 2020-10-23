public class Program
{
    public static void main(String[] args) {
    
    int a[]={1,2,3,4,5,6,7,8,9};
    int c=1;
    //a.length give the lentgh array 
    for (int i=0;i<a.length;i++)
    {
          c=c*a[i];
          System.out.println("now c is "+c);
          }
        System.out.println("product of array is "+c);
    
    }
}