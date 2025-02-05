public class Producer extends Thread{

    private String name;
    private Queue queue;
    private int nrOfMassages;

    public Producer(String name, Queue q){
        this.name = name;
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            String m = "Masssage " + ++nrOfMassages + " by producer " + name;
            System.out.println("Put: " + m);
            queue.putLast(m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
