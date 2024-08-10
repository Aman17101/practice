import java.util.*;

public class duplicateinArray {
    public static void main(String[] args) {
        
        int arr[]={2,5,6,7,11,8,2,9,5,7};

        duplicateinArray.findduplicate(arr);
    }

        public static void findduplicate(int []arr){

        Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int x:arr){
            if(!hm.containsKey(x)){
                hm.put(x, 1);

            }
            else{
                hm.put(x,hm.get(x)+1);
            }
           
            
        }
        for(Integer x:hm.keySet()){
            if(hm.get(x)>1)
            System.out.println("Duplicate element is :"+x);
        }
       
    
    }
}
