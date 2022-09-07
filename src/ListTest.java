import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list1 = new List();
    Node node1 = new Node("Hej");

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertEquals(true,list1.isEmpty());
        list1.head = node1;
        list1.tail = node1;
        assertEquals(false,list1.isEmpty());

    }

    @Test
    void insertFromHead() {
        list1.insertFromHead(new Node("1"));
        assertEquals("1",list1.printFromHead());

    }

    @Test
    void insertFromTail() {
    }

    @Test
    void smartConstructor(){
        List smartList = new List("hold da op det er smart");
        assertEquals("hold da op det er smart", smartList.printFromTail());
    }

    @Test
    void insertStringFromHead(){
        list1.insertFromHead("hej");
        assertEquals("hej",list1.printFromHead());
    }

    @Test
    void insertStringFromTail(){
        list1.insertFromTail("hej med");
        assertEquals("hej med",list1.printFromTail());
    }

    @Test
    void smartInsertFromHead(){
        list1.insertFromHead("Hej med dig");
        assertEquals(false, list1.onlyOne());
        assertEquals("Hej med dig", list1.printFromTail());
    }
}