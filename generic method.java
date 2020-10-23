
//generic method 
public class Program
{
    public static void main(String[] args) {
        String str="print every thing";
       int intvar=2017;
       double d=15.9;
        //print every type variable by using generics
       prints (str);
       prints (intvar);
       prints (d);
    }
    public static <T>void prints(T t){
        System.out.println(t);
    }
}

