import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Passenger extends Thread {
    private Semaphore semaphore;
    private int id;
    private CountDownLatch cdl;

    public Passenger(Semaphore semaphore, int id, CountDownLatch cdl) {
        this.semaphore = semaphore;
        this.id = id;
        this.cdl = cdl;
    }

    public synchronized void run(){
        try {
            semaphore.acquire();
            System.out.println("Пассажир" + id + "Покупает билет");
            sleep(10);


            System.out.println("Пассажир" + id + "Купил билет");
            semaphore.release();

            System.out.println("Пассажир " + id + " Cел в автобус");
            cdl.countDown();
            cdl.await();














        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
        }


