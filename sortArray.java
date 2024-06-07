import java.util.Scanner;
public class sortArray {

    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortZeroesAndOnes(int arr[]){
        int n=arr.length;

        int left =0,right=n-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[right]==1){
                right--;
            }
            if(arr[left]==0){
                left++;
            }
           
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array :");
printArray(arr);
sortZeroesAndOnes(arr);
System.out.println("sorted array :");
printArray(arr);
    }
}
