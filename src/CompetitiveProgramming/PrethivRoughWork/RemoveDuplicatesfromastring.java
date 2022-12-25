package CompetitiveProgramming.PrethivRoughWork;

import java.util.HashSet;

public class RemoveDuplicatesfromastring {


    static void removeDuplicate(String str){
        HashSet<Character> set = new HashSet<>();
        for(char i:str.toCharArray()){
            set.add(i);
        }
        for(char i:set){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        removeDuplicate(s);
    }


}
