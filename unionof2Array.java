class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
     Set<Integer>unionSet=new HashSet<>();
     for(int num:a){
         unionSet.add(num);
     }
     for(int num:b){
         unionSet.add(num);
     }
     return unionSet.size();
     }
    
}
