package MainPackage.multithreading;
public class LocalThreadMethod {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal(){
            public Object initialValue(){ //Initial Value of local variable
                return "ABCDE";
            }
        };
        System.out.println(tl.get()); // ABCDE
        tl.set("Sumit");
        System.out.println(tl.get());//Sumit
        tl.remove();
        System.out.println(tl.get());//ABCDE
    }
}


