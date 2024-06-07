import java.util.*;
public class prob_Al {

     static void  reverseList(ArrayList<Integer>list){

        int i=0,j=list.size()-1;
        while(i<j){

            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

     }
    public static void main(String[] args) {

        ArrayList <Integer>list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(330);
        list.add(70);
        list.add(80);
        list.add(90);
        System.out.println("original list"+list);

        reverseList(list);
        System.out.println("reverse list "+list);

Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
    }
}
