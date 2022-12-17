class NewThread implements Runnable{
    String name;
    Thread t;
    int delay;
    static int tempno=0;

    NewThread(String name,int delay){
        this.name = name;
        t=new Thread(this,name);
        this.delay = delay;
        System.out.println("New Thread Created :"+t);
    }

    public void run(){
        for(int i=0;i<1000;i++){
            tempno++;
            System.out.println(tempno);
        }
        System.out.println(name+" Exiting");
    }

}

class MultithreadingTuto {
    public static void main(String args[]) throws InterruptedException {
        NewThread nt1 = new NewThread("One",100);
        NewThread nt2 = new NewThread("Two",100);
        NewThread nt3 = new NewThread("Three",1000);
        nt1.t.setPriority(10);
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        nt1.t.join();
        nt2.t.join();
        nt3.t.join();
//        System.out.println("END");
        System.out.println("TempNO"+NewThread.tempno);
    }
}