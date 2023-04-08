package MainPackage.multithreading;
//Program:1
public class ThreadByExtendThread extends Thread {
    public  void run(){
        int a = 10 ;
        System.out.println(a);
    }
    public static void main(String[] args) {
        ThreadByExtendThread tet1 = new ThreadByExtendThread();
        ThreadByExtendThread tet = new ThreadByExtendThread();
       try {
            tet1.start();
            tet.start();
            tet.start(); //repetition is occurred so it will show IllegalThreadStateException
        }catch (IllegalThreadStateException e) {
            System.out.println("IllegalThreadStateException is due to thread repeat");
        }catch (Exception e){
            System.out.println("IllegalThreadStateException is occurs");
        }
        System.out.println("Program to be continue....");}}

