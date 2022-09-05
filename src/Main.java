public class Main {
    public static void main(String[] args) {

        // Creates nodes with strings inside
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node0 = new Node("0");

        // Makes the nodes connect to eachother
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.prev = node2;
        node2.prev = node1;
        node1.prev = node0;

        Node n = node0;

        printFromHead(node0);

    }

    private static void printFromHead(Node n) {

        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}