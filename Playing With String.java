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
		Scanner sc =new  Scanner (System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    String s=sc.next();
		    String r=sc.next();
		    int a1=0, z1=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1')
		        a1++;
		        if(s.charAt(i)=='0')
		        z1++;
		    }
		    int a2=0,z2=0;
		    for(int i=0;i<n;i++){
		        if(r.charAt(i)=='1')
		        a2++;
		        if(r.charAt(i)=='0')
		        z2++;
		    }
		    if(a1==a2&&z1==z2)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		    t--;
		}
		
	}
}
