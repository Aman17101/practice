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
	//	int arr[]=new int[n];
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		   
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int count=1;
		    int max=1;
		    for(int i=0;i<n-1;i++){
		       
		        if(arr[i]==arr[i+1]){
		            count++;
		            if(count>max){
		                max=count;
		            }
		            
		        }
		        else {
		            count=1;
		        }
		   	
		    }
		   	System.out.println(n-max);
		    }
		    

		}
	
		
	}

