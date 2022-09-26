public class CustomThread extends Thread {
    String name;
    Integer counter;

    public CustomThread(String s, Integer counter) {
        this.name = s;
        this.counter = counter;
    }

    public void run() {
        System.out.println("Starte Thread " + name);
        synchronized (counter){

        for (int i = 0; i < 5; i++) {


            try {
                Thread.sleep(100);
                System.out.println(counter++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Beende Thread " + name);
        }

    }
}
