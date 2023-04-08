package MainPackage.multithreading;

public class ThreadInterrupted {
    private volatile int counter = 0;
    private volatile boolean dirty = false;


        public synchronized int incrementAndGet() throws InterruptedException {
            if (dirty) {
                throw new IllegalStateException("this should never happen");
            }
            dirty = true;
            // ...
            Thread.sleep(5000); // boilerplate not included
            // ...
            counter = counter + 1;
            dirty = false;
            return counter;
        }
    public static void main(String[] args) throws InterruptedException {
        var ThreadInterrupted = new ThreadInterrupted();

        var t1 = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    ThreadInterrupted.incrementAndGet();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        t1.start();
        Thread.sleep(500);
        t1.interrupt();


    }
}
