import java.util.Scanner;

public class pra30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int min;
        
        int a[]=new int [5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();

        }
        min=a[0];
        for(int i=1;i<5;i++){
            if(a[i]<min)
            min=a[i];
            // else 
            // max=a[0];
        }
        System.out.println(min);

    }
}
