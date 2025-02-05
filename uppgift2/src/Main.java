public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer p1 = new Producer( "Shero" , q );
        //Producer p2 = new Producer( "producer no 2" , q );
        new Thread( p1 ).start();
        //new Thread( p2 ).start();

        Consumer c1 = new Consumer(q);
        //Consumer c2 = new Consumer( "no 2", q );
        //Consumer c3 = new Consumer( "no 3", q );
        new Thread( c1 ).start();
        //new Thread( c2 ).start();
        //new Thread( c3 ).start();
    }
}