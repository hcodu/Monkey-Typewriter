import java.util.LinkedList;
import java.util.Queue;

public class SizeLimitedQueue {
    private int size;
    Queue<String> queue = new LinkedList<>();

    public SizeLimitedQueue(int size) {
        this.size = size;
    }

    public void addElement(String letter) {
        queue.add(letter);
        if (queue.size() > size) {
            queue.remove();
        }
    }
    public String getFirst() {
        return queue.peek();
    }
}