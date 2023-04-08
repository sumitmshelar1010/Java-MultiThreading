package MainPackage.multithreading;

public class ThreadWithoutRun extends Thread{

    //IF WE ARE NOT OVERRIDING RUN METHOD THEN THREAD CLASS RUN() WILL BE EXECUTED WHICH HAS EMPTY IMPLEMENTATION
    //AND HENCE WE WON'T GET ANY OUTPUT
     void method1(){
         int a=10;
         System.out.println(a);
     }

    public static void main(String[] args) {
        ThreadWithoutRun twr = new ThreadWithoutRun();
        twr.start();
    }

}
