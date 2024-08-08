class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum1=0;
        
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
            
        }
        int sum2=0;
         for(int i=1;i<=n;i++){
                sum2+=i;
            
        }
        return (sum2-sum1);
    }
}
