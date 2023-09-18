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
		   String sub1=""; String sub2="";
		   for(int i=0;i<n;i++){
		   if(s.charAt(i)=='0'){
		       sub1+='0';
		   }
		   if(s.charAt(i)=='1'){
		       sub2+='1';
		   }
		   }
		   System.out.println(sub1+sub2);
		    t--;
		}
	}
}
