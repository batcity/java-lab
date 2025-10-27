class Synchronized {

    int counter = 0;

    synchronized void incrementCounter() {
        counter++;
    }

    public static void main(String args[]) {

        Synchronized obj = new Synchronized();
        Thread t1 = new Thread(() -> {obj.incrementCounter();});;

        // Without braces — cleaner
        Thread t2 = new Thread(() -> obj.incrementCounter());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter's value is: " + obj.counter);
    }
}