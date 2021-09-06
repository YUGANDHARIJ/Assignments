package com.resturant.bill;

import java.util.Scanner;
 
public class Restaurants 
{
   
    public static void main(String[] args) 
    {
        
    Scanner input = new Scanner(System.in);
	String[] s = new String[] {"pallav   ","chitranna   ","masala dosa","pulihogare","ice cream","poori ","bonda     ","tea   ","coffee    ","Quit     "};
	int[] rate = new int[]{35,30,40,35,25,30,25,10,15,0};
	int[] qt = new int[10];
        int sum=0;
	boolean quit=true;
         
        
        do
        {
            System.out.println("  ITEM"+"\t\t PRICE DETAILS");
		for(int i=0;i<10;i++)
            System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
		 System.out.println("Enter the item no: ");
		
	
            
            
            int c=input.nextInt();
	    if(c>0 && c<10)
	    {
		System.out.println("Enter the no of quantites of "+s[c-1]+":");
                 int quantity=input.nextInt();
	         qt[c-1]+=quantity;
	         System.out.println("Enter 10/0 to complete the order:\n");
	        
	    }
	    else
	        {
               quit=false;
              
            }
        
        }
        while(quit);
	
	   
        System.out.println("Your Orders are:\n");
	    for(int i=0;i<10;i++)
	    {
             if(qt[i]!=0)
	     {
	      sum+=qt[i]*rate[i];
              System.out.println(s[i]+"*"+qt[i]+"=="+qt[i]*rate[i]+"rs");
	     }
	    }
  
        
         System.out.println("Your total bill="+sum);
        
         System.out.println("Your order is succesful");
        
        
         System.out.println("Thank you.");
    
    
    }
    
}