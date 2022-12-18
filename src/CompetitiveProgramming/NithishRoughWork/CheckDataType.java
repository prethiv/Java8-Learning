package CompetitiveProgramming.NithishRoughWork;

public class CheckDataType {


    public static void main(String[] args) {
        int a =10;
        String b = "hello user";
        char c = 'D';
        System.out.println(a+" "+ ((Object)a).getClass().getSimpleName());
        System.out.println(b+" "+ ((Object)b).getClass().getSimpleName());
        System.out.println(c + " "+((Object)c).getClass().getSimpleName());

    }

}
