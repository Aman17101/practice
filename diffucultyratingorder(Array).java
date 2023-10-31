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
		Scanner sc =new Scanner (System.in);
		t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for (int i=0;i<n;i++){
		     arr[i] = sc.nextInt() ;
		     
		     
		    } 
		    boolean increasingOrder =true;
		    for(int i=1;i<n;i++){
		      if  (arr[i]<arr[i-1]){
		      increasingOrder =false;
		    //  break;
		      }
		       
		    }
		    if (increasingOrder){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		    
		   
		}
	}
}
