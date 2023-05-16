import javax.sound.sampled.SourceDataLine;

public class stringreverse {
    public static void main(String arg[]){
        StringBuilder name=new StringBuilder("hello");

        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;//->5-1-0=4

            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);





        }
System.out.println(name);
    }
    
    
}
