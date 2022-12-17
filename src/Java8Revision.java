 class Box{
    public int height;
    public int width;
    public double length;
    public String boxname;

    public String toString(){
        return "Height: "+height+" width: "+width+" length: "+length+" boxname :"+boxname;
    }
}

interface sharedConstants{
    int LOW=1;
    int MEDIUM=10;
}


public class Java8Revision implements Constants {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = box;

        System.out.println(box.equals(box1));
        System.out.println(box);
        System.out.println(box1);
        System.out.println(box.toString());
        System.out.println("Audio levels max is "+HIGH);
        System.out.println("Audio levels medium is "+MEDIUM);
        System.out.println("Audio levels low is "+LOW);
        System.out.println("SharedConstants value ");
    }
}
