public class Main {
    public static void main(String[] args) {
        Integer counter = 0;

        CustomThread t1 =new CustomThread("Erster Fred:)", counter);
        CustomThread t2 =new CustomThread("Zweiter Fred:)", counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ende ");


    }
}
