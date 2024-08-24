import java.util.*;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("linked list program ");
        list.addFirst("a");
        list.addFirst("This is ");
        list.addLast("hello");
        list.add("hiiiii"); // by default last me hi add hoga
        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "--> ");
        }

    }

}
