/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int om[]=new int[n];
		    int addy[]=new int[n];
		    for(int i=0;i<n;i++){
		        om[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        addy[i]=sc.nextInt();
		    }
		    int counto=0;int counta=0;
		    int maxo=0;int maxa=0;
		    
		    for(int i=0;i<n;i++){
		   
		    if(om[i]!=0){
		        counto++;
		    }
		    else{
		        counto=0;
		    }
		    maxo=Math.max(counto,maxo);
		    }
		    for(int i=0;i<n;i++){
		        if(addy[i]!=0){
		            counta++;
		        }
		        else{
		            counta=0;
		        }
		        maxa=Math.max(counta,maxa);
		    }
		    if(maxo>maxa){
		        System.out.println("Om");
		    }
		    else if(maxo<maxa){
		        System.out.println("Addy");
		    }
		    else{
		        System.out.println("Draw");
		    }
		    
		    t--;
		}
	}
}
