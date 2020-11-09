import java.lang.*;
import java.io.*;


public class Program
{
    public static void main(String[] args) {
    try{
    Runtime r=Runtime.getRuntime();
    Process pro=r.exec("echo Hello world !!!");
    BufferedReader ls=new BufferedReader(new InputStreamReader(pro.getInputStream()));
    String line=new String();
    while((line=ls.readLine())!=null)
    {
        System.out.println(line);
    }
    
    
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    
        
    }
}