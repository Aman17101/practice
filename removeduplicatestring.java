class Solution {
    String removeDuplicates(String str) {
        
        LinkedHashSet<Character> set = new LinkedHashSet<>(); 
       StringBuilder result = new StringBuilder();
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        // print the string after removing duplicate characters   
        for(Character ch : set)   
            result.append(ch);  
            
            return result.toString();

    }
}
