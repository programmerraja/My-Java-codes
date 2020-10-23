public class Program

{
static void sum(int p[])
{
int sum=0;
    for (int i:p)
    {
        sum+=i;
    }
    System .out.print(sum);
}
    public static void main(String[] args) {
     int x[]={23,30,40};
     sum(x);
    }
}