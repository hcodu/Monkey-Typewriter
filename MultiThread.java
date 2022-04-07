import java.util.Stack;
import java.util.Timer;

public class MultiThread implements Runnable {
    SizeLimitedQueue queue;
    Stack<String> wordStack = new Stack<String>();
    String[] list;

    Stopwatch stopwatch = new Stopwatch();

    public MultiThread(String[] list) {
        System.out.println();
        this.list = list;

        queue = new SizeLimitedQueue(5);
    }    

    public MultiThread(String word) {
        System.out.println();
        list = new String[1];
        list[0] = word;

        queue = new SizeLimitedQueue(word.length());

    }    



    public void run() {
        try {
            // Displaying the thread that is running

            stopwatch.start();

            while(true) {

                char c = (char) ((int) (Math.random() * 26) + 65);
                String letter = Character.toString(c);
                queue.addElement(letter);

                System.out.println(queue.getWord());
                
                for(int i = 0; i < list.length; i++) {
                    if(queue.getWord().equalsIgnoreCase(list[i])) {
                        wordStack.push((String) list[i]);
                        System.out.println("Monkey Got " + wordStack.peek() + " in " + stopwatch.getElapsedSeconds() + " seconds");
                        break;
                    }
                }

                if(wordStack.size() != 0) {
                    break;
                }

                Thread.sleep(20);

            }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}