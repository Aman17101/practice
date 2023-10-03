                                             // find biggest element in array

import java.util.Scanner;

public class pra29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n ,max;
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max)
            max=a[i];
            // else 
            // max=a[0];
        }
        System.out.println(max);

    }
}
