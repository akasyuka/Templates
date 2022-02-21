import java.util.*;

public class Queues {
    public static void main(String[] args) {
//FIFO
//      PriorityQueue,ArrayQueue, ArrayDequeue
        Queue<String> men = new LinkedList<>();
        men.add("Саша");
        men.add("Игорь");
        men.add("Слава");

        men.element();//get(0)
        men.peek();//get(0)
        men.poll();//get(0), remove(0)
        men.remove();//get(0), remove(0)
        men.offer("Арсений");//addLast()
    }
//LIFO
//ArrayQueue, ArrayDequeue
    Deque<String> products = new LinkedList<>();

}
