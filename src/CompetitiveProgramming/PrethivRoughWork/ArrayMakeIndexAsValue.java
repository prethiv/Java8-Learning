package CompetitiveProgramming.PrethivRoughWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayMakeIndexAsValue {


    public static void fixArray(int[] ar){
        int length = ar.length;
        Set<Integer> s = new HashSet<>();
        Arrays.stream(ar).forEach(integer->{
            s.add(integer);
        });
        for(int i=0;i<length;i++){
            if(ar[i]!=i){
                if(s.contains(i)){
                    ar[i]=i;
                }
                else{
                    ar[i]=-1;
                }
            }
        }

    }


    public static void main(String[] args) {

        int[] ar={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        fixArray(ar);
        Arrays.stream(ar).forEach(i->{
            System.out.println(i);
        });

    }

}
