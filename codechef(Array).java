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
		int t;
		Scanner sc=new Scanner (System.in);
		t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int [n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		  }
		  for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		         }
		         int cost=0;
		         for(int i=0;i<n;i++){
		             if(a[i]>=x){
		                 cost+=b[i];
		             }
		         }
		         System.out.println(cost);
		    
		}
	}
}
