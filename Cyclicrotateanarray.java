class Compute {
    
    public void rotate(int arr[], int n)
    {
     int i=n-1;
     int j=n-2;
     while(i>0){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i--;
         j--;
         
     }
     
    }
}
