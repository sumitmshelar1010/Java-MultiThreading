package MainPackage.multithreading;

public class ThreadImplementsInterface implements Runnable {
    //DEFINING THREAD BY IMPLEMENTING "RUNNABLE" INTERFACE

    public void run(){
        String s = "I am getting output";
        System.out.println(s);
    }
    public static void main(String[] args) {
        ThreadImplementsInterface tei = new ThreadImplementsInterface();
        //tei.start();//IT WILL NOT COMPILE CODE
        Thread t1 = new Thread(tei);// THREAD BY USING RUNNABLE INTERFACE
        t1.start();//IT WILL CREATE A NEW THREAD
        t1.run();// IT WILL EXECUTE RUN METHOD AS A NORMAL METHOD
        tei.run();//IT WILL EXECUTE RUN METHOD AS A NORMAL METHOD
    }
}
