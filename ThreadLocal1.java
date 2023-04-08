package MainPackage.multithreading;

public class ThreadLocal1 extends Thread {
    private ThreadLocal tl = new ThreadLocal();
    private  ThreadLocal t2 =new ThreadLocal();
    public void run(){
    int a;
    int b;
        tl.set(a =100);{
            System.out.println(tl.get());}
            t2.set(a=500);{
            System.out.println(t2.get());
    }}

    public static void main(String[] args) {
        ThreadLocal1 b = new ThreadLocal1();
        b.start();
    }
}
