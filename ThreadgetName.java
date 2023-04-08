package MainPackage.multithreading;

public class ThreadgetName extends Thread {

    // WE CAN GET & SET NAMES OF A THREAD BY USING THE FOLLOWING METHODS OF THREAD CLASS
    public static void main(String[] args) {
        ThreadgetName pr = new ThreadgetName();
        pr.start();
        currentThread().setName("Sumit"); //current thread is used to set the name
        String bl = currentThread().getName();
        if (bl.equals("Sumit")) {
            System.out.println("Name is change ");
    }

}
}
