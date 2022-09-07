public class Main {
    public static void main(String[] args) {

        // Creates nodes with strings inside
        //Node node1 = new Node("1");
        //Node node2 = new Node("2");
        //Node node3 = new Node("3");
        //Node node0 = new Node("0");

        // Makes the nodes connect to eachother
        // Next
        //node0.next = node1;
        //node1.next = node2;
        //node2.next = node3;
        // Prev
        //node3.prev = node2;
        //node2.prev = node1;
        //node1.prev = node0;

        //List list = new List();

        // Den sætter virker ind som første plads, så sætter den det ind bag ved virker osv osv.
        List list = new List("virker det her?");
        System.out.println(list.printFromTail());

        list.insertFromHead("Måske");
        System.out.println(list.printFromTail());

        list.insertFromTail("Test");
        System.out.println(list.printFromHead());
    }

}