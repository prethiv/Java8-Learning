public class Nithish {


    public static void heavyComputation(int threadid,int range){
        for(int i=0;i<range;i++){
            System.out.println("Heavy Computation "+threadid);
        }
        System.out.println("END OF THREAD "+threadid);
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("STarted");
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("payment started");
        Thread t1 = new Thread(()->{
           heavyComputation(1,1000);
        });
        Thread t2 = new Thread(()->{
           heavyComputation(2,1000);
        });
        t1.start();
        t2.start();
        System.out.println("line n");
        System.out.println("line 1000");
        System.out.println("Send email");
        t1.join();
        String paymemntStatus = "Success";
        System.out.println(paymemntStatus);
        System.out.println("Program end");


    }

}
