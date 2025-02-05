public class Consumer extends Thread{
    private Queue queue;

    public Consumer(Queue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println((String) queue.getFirst());
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {}
        }
    }
}
