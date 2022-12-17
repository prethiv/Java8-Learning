import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTuto {
    public static void cmpIntensiveTask1(){
        for(int i=0;i<100;i++){
            System.out.println("1 "+i+" ");
        }
    }


    public static void cmpIntensiveTask2(){
        for(int i=0;i<100;i++){
            System.out.println("2 "+i+" ");
        }
    }


    public static void main(String[] args)throws Exception {
        Thread t1 = new Thread(()->{
//           cmpIntensiveTask1();
        });
        Thread t2 = new Thread(()->{
//            cmpIntensiveTask2();
        });

        t1.start();
//        t1.join();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("END!!!");
        System.out.println("Before promise 1");
        CompletableFuture<Void> promise1 = CompletableFuture.runAsync(()->{
            cmpIntensiveTask1();
        });
        System.out.println("After Promise 1");
        System.out.println("Before Promise 2");
//        promise1.join();
        CompletableFuture<String> promise2 =  CompletableFuture.supplyAsync(()->{
            cmpIntensiveTask2();
            return "Prethiv";
        }).thenApply(x->{
            System.out.println("What is "+x);
            return x;
        });
        System.out.println("After Promise 2");

        CompletableFuture<Void> result = CompletableFuture.allOf(promise1,promise2);
        result.join();
//        System.out.println(result.get());
        System.out.println("END OF THE PROGRAM");


//        resolve(() -> people.get(0).getAddress().getPostalCode());
//    .ifPresent(System.out::println);
//
//:
//        public static <T> Optional<T> resolve(Supplier<T> resolver) {
//            try {
//                T result = resolver.get();
//                return Optional.ofNullable(result);
//            }
//            catch (NullPointerException e) {
//                return Optional.empty();
//            }
//        }
    }

}
