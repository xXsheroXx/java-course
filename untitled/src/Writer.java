public class Writer extends Thread{

    private String name;
    private long intervall;

    public Writer(String name, long time) {
        super();
        this.name = name;
        intervall = time * 1000;
    }

    @Override
    public void run(){
        for (int i=0; i < 10; i++) {
            System.out.println(name);
            try {
                Thread.sleep(intervall);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
