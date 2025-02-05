public class StartAndStop implements Runnable{

    private Thread thread;
    private boolean running;

    public StartAndStop(){
        thread = null;
        running = false;
    }

    synchronized public void start() {
        if(!running){
            thread = new Thread(this);
            thread.start();
            running = true;
        }
    }

    synchronized public void stop() {
        if(running) {
            running = false;
            thread = null;
        }
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                thread = null;
            }
        }

        System.out.println("Thread returning gracefully");
    }
}
