import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    LinkedListDemo list;
    @BeforeEach
    public void setup() {
        list = new LinkedListDemo();
    }

//
//    @Test
//    public void moveTailToFrontTest() {
//        Node head = list.createStringList("Tanner", "Is", "Testing");
//        list.printStringList(head);
//        System.out.println();
//        list.moveTailToFront(head);
//        list.printStringList(head);
//    }

    @Test
    public void constructLinkedLink() {

        Node head = list.createIntList(3,5,2,1,4,5,6,7,8);
        assertEquals(3,head.getElement());

        Node next = list.createStringList("Tanner","Kevin","David");
        next = list.removeStringElement(next, "Tanner");
        System.out.println(next.getWord());
    }

    @Test
    public void testing() {
        Node head = list.createIntList(1,2,3);
        System.out.println(list.traverseIntList(head));

        Node temp = list.createStringList("You", "Are", "A", "Bitch");
        System.out.println(list.traverseWords(temp));
    }

    @Test
    public void countTest() {
        Node head = list.createIntList(1,8,34,64,23,7);
        assertEquals( 6, list.getCountRec(head));
        assertEquals( 6, list.getCount(head));
    }

    @Test
    public void getIntAtTest() {
        Node head = list.createIntList(3,7,35,64,1,90);
        assertEquals(35, list.getIntAt(head, 3));
        assertEquals(1, list.getIntAt(head, 5));
        assertEquals(90, list.getIntAt(head, 6));
    }


}
