package com.tamilprogrammers;

import com.tamilprogrammers.indian_bank;


/*

Interface in java 

private>default>protected>public;

*/
public class interfaceinjava {

public static void main(String a[])
{
indian_bank obj=new indian_bank();
obj.transfer_money();
american_bank obj1=new american_bank();
obj1.transfer_money();

}

}

interface credit_card
{
 int card_no2=1234;
void transfer_money();

}



class indian_bank implements credit_card

{
public  void transfer_money()
{
System.out.println("Money is transfers in Rupees!!");

System.out.println("credit card no "+credit_card2.card_no2);
}
}
class american_bank implements credit_card
{

public void transfer_money()
{
System.out.println("Money is transfers in Doller !!");

System.out.println("credit card no "+credit_card.card_no);
}
  
}

