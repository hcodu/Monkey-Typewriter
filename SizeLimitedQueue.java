import java.util.LinkedList;
import java.util.Queue;

public class SizeLimitedQueue {
    private int size;
    Queue<String> queue = new LinkedList<>();
    String[] list;

    public SizeLimitedQueue(int size) {
        this.size = size;
        list = new String[this.size];
    }

    public void addElement(String letter) {
        // for(int i = 0; i < size; i++) {
        //     list[i] = list[i + 1];

        //     if(i == size - 1) {
        //         list[i] = letter;
        //     }    
        // }

        if(size == 4) {
            list[0] = list[1];
            list[1] = list[2];
            list[2] = list[3];
            list[3] = letter;
        }
        else if(size == 5) {
            list[0] = list[1];
            list[1] = list[2];
            list[2] = list[3];
            list[3] = list[4];
            list[4] = letter;
        }


        // queue.add(letter);
        // if (queue.size() > size) {
        //     queue.remove();
        // }
    }
    public String getFirst() {
        return queue.peek();
    }

    public String getWord() {
        String word = "";
        for(int i = 0; i < size; i++) {
            word += list[i];
        }
        
        return word;
    }
}
