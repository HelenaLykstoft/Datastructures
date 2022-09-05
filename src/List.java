public class List {

    Node head = null;
    Node tail = null;

    Node insertFromHead(Node node){
        if (isEmpty()) {
            // Er listen tom?:
            head = node;
            tail = node;
            return head;// Returnerer altid den sidst indsatte
        }
        // Ikke tom:
        node.next = head;
        head.prev = node;
        head = node;
        return head;
    }

    boolean isEmpty(){
        return head == null && tail == null;
    }


    String printFromHead() {
        StringBuilder stringBuilder = new StringBuilder();

        Node n = head;
        while (n != null){
            stringBuilder.append(n.data + " ");
            n = n.next;
        }
        return stringBuilder.toString().trim();
    }


    public void printFromTail(Node n1) {

        while (n1 != null){
            System.out.println(n1.data);
            n1 = n1.prev;
        }
    }

}

