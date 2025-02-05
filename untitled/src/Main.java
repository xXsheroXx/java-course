public class Main {
    public static void main(String[] args) {

        StartAndStop sas1 = new StartAndStop();
        StartAndStop sas2 = new StartAndStop();
        StartAndStop sas3 = new StartAndStop();
        for (int i=0; i < 100; i++){
            for(int j=0; j<10000000; j++)
            {
                sas1.start();
                sas2.start();
                sas3.start();
            }
        }
        sas1.stop();
        sas2.stop();
        sas3.stop();
    }
}