public class List {

    Node head = null;
    Node tail = null;

    public List(String s) {
        String [] strings = s.split(" ");
        for (String string : strings) {
            insertFromHead(new Node(string));
        }
    }

    public List(){

    }


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
        tail.next = node;
        tail = node;
        return tail;
    }

    public void removeFromHead(){
        if (isEmpty()){
            return;
        }
        if (head==tail){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev.next = null;
        head.prev = null;
    }

    public void removeFromTail(){
        if (isEmpty()){
                return;
        }
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
    }

    boolean isEmpty(){
        return head == null && tail == null;
    }

    boolean onlyOne(){
        return head == tail && head != null;
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

    public Node insertFromHead(String s) {
        String [] strings = s.split(" ");
        for (String string : strings) {
            insertFromHead(new Node(string));
        }
        return head;
    }

    public Node insertFromTail(String s) {
        String [] strings = s.split(" ");
        for (String string : strings){
            insertFromTail(new Node(string));
        }
        return tail;
    }



}

