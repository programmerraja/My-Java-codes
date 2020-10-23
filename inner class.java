public class Program
{
int x=2;
class p{
    int x=20;
    void m1()
    {
        System.out.print(Program.this.x);
    }
}
    public static void main(String[] args) {
    Program o=new Program();
    Program.p obr=o.new p();
    obr.m1();
        
    }
}