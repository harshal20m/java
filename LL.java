public class LL {
    Node head;

    // step 1 :

    class Node { // we need a node class
        String data;
        Node next; // oops concept implemented

        Node(String data) { // constructore of node class
            this.data = data;
            this.next = null;
        }
    }

    // operations on Linked Lists
    // add - first , last

    // add from first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        LL.Node head;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add to last
    public void addLast() {

    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
    }
}
