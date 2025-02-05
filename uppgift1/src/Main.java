public class Main {
    public static void main(String[] args) throws InterruptedException {
        DigitalClock dc1 = new DigitalClock();
        dc1.startClock();
        Thread.sleep(10000);



        dc1.stopClock();

    }
}