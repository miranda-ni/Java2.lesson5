import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {
    private static int Passenger = 100;

    public static void main(String[] args) throws InterruptedException {
Semaphore sem = new Semaphore(100,true);
        CountDownLatch cdl = new CountDownLatch(100);
        for (int i = 1; i <= Passenger; i++) {
            Passenger p = new Passenger(sem,i,cdl);

            p.start();
            Thread.sleep(1000);
















        }





    }


}
