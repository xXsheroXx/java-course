import java.util.LinkedList;
import java.util.List;

public class Queue<T> {

    private static final int MAX_MASSAGES = 5;
    private List<T> massages;

    public Queue() {
        super();
        massages = new LinkedList<>();
    }

    synchronized public void putLast(T msg) {
        while (massages.size() >= MAX_MASSAGES) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        massages.add(msg);
        notifyAll();
    }

    synchronized public T getFirst() {
        while (massages.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        T msg = massages.get(0);
        massages.remove(0);
        notifyAll();
        return msg;
    }
}
