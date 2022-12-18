import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    static int addOvf(int result, int a, int b)
    {
        result = a + b;
        if(a > 0 && b > 0 && result < 0)
            return -1;
        if(a < 0 && b < 0 && result > 0)
            return -1;
        return 0;
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        int k1pos=x1;
        int k2pos=x2;
        int jumpK1=0;
        int jumpk2=0;
        while(k1pos!=k2pos){
            if(k1pos==k2pos&&jumpK1==jumpk2){
                return "YES";
            }
            int res=0;
            int res2=0;
            if(addOvf(res,k1pos,v1)==-1||addOvf(res2,k2pos,v2)==-1){
                return "NO";
            }

            k1pos+=v1;
            jumpK1++;
            k2pos+=v2;
            jumpk2++;
            if(k2pos>k1pos&&v2>v1||k1pos>k2pos&&v1>v2){
                return "NO";
            }
        }
        if(k1pos==k2pos&&jumpK1==jumpk2){
            return "YES";
        }
        else {
            return "NO";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
       System.out.println(Result.kangaroo(0 ,3 ,4 ,2));
    }
}
