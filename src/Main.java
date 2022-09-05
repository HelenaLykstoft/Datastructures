public class Main {
    public static void main(String[] args) {

        // Creates nodes with strings inside
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node0 = new Node("0");

        // Makes the nodes connect to eachother
        // Next
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        // Prev
        node3.prev = node2;
        node2.prev = node1;
        node1.prev = node0;

        List list = new List();
        list.head = node0;
        list.tail = node3;

        System.out.println(list.printFromHead());
        list.printFromTail(list.tail);

    }

}