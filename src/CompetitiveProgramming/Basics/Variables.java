package CompetitiveProgramming.Basics;

public class Variables {
//    String - stores text, such as "Hello". String values are surrounded by double quotes
//    int - stores integers (whole numbers), without decimals, such as 123 or -123
//    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//    boolean - stores values with two states: true or false


//    Data Type	Size	Description
//    byte	1 byte	Stores whole numbers from -128 to 127
//    short	2 bytes	Stores whole numbers from -32,768 to 32,767
//    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//    float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//    double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//    boolean	1 bit	Stores true or false values
//    char	2 bytes	Stores a single character/letter or ASCII values
//
    public static void main(String[] args) {
        String s1="This is a sample string";
        String s2=new String("This is a sample 2 string");
        String s3= new String(s2);
        System.out.println(s1.length());
        System.out.println(s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

        int a=3;
        int b=2,x=5;

        float f= (float) 2.2;

        double d =2.2;

        char chr ='P';
        char spcialChr='#';
        char noinchr='9';

        boolean isValid=true;
        boolean isinvalid=false;

        byte t= (byte) 250;
        System.out.println(t);

        String intstring = String.valueOf(99);

        int stringInteger = Integer.parseInt("9456");

        int[] array = new int[5];

        System.out.println(array.length);






    }


}
