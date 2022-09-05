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

    Node insertFromTail(Node node){
        if (isEmpty()){
            head = node;
            tail = node;
            return tail;
        }
        node.prev = tail;
        tail.prev = node;
        tail = node;
        return tail;
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


    String printFromTail() {

        StringBuilder stringBuilder = new StringBuilder();
        Node n = tail;
        while (n != null){
            stringBuilder.append(n.data + " ");

            n = n.prev;
        }
        return stringBuilder.toString().trim();
    }

}

