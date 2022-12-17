
enum Apple{
    Jonathan,GoldenDel,RedDel,Winesap,Cortland
}

enum Apple2{
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);

    private int price;

    Apple2(int price){
        System.out.println("IInside cons"+this);
        this.price = price;
    }

    int getPrice(){
        return price;
    }


}

public class EnumerationTuto {
    public static void main(String[] args) {
        Apple ap;

        ap=Apple.RedDel;

        System.out.println("Value of ap "+ap);

        Apple[] apples = Apple.values();

        for(Apple a:apples){
            System.out.println(a);
        }

        for(Apple2 a:Apple2.values()){
            System.out.println("a"+a+a.getPrice());
        }

        Apple2 ap2 = Apple2.Winesap;

        System.out.println(ap2);

    }
}
