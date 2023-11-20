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
		   String S=sc.next();
		   String result="";
		   for(int i=0;i<S.length();i+=2){
		       if(S.charAt(i)=='0'&&S.charAt(i+1)=='0'){
		           result+="A";
		       }
		       else if(S.charAt(i)=='0'&&S.charAt(i+1)=='1'){
		           result+="T";
		       }
		       else if(S.charAt(i)=='1'&&S.charAt(i+1)=='0'){
		           result+="C";
		       }
		       else {
		           result+="G";
		       }
		       
		   }
		   System.out.println(result);
		    
		    
		}
	}
}
