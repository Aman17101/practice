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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		int n=sc.nextInt();
		String s=sc.next();
		int res=0;
		for(int i=0;i<s.length()-1;i++){
		    
		 if  ( s.charAt(i)=='1'&&s.charAt(i+1)=='0')
		 res+=1;
		 
		    
		}
		System.out.println(res);
		t--;
		    
		}
	}
}
