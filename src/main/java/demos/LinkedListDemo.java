package demos;

import java.util.Objects;

public class LinkedListDemo {


    /**
     * A utility method that inserts an element immediately after the targeted element, if the targeted element exists.
     * @param head The first element in the linked list that links to the subsequent elements.
     * @param element Desired element to insert into the list.
     * @param target The target element to insert the new element before.
     * @return The list with the new inserted element.
     */
    public Node insertAfter(Node head, int element, int target) {
        // Find the target demos.Node first.
        Node curr = head;
        while (curr != null) {
            if (curr.getElement() == target) {
                break;
            }
            curr = curr.getNext();
        }

        // If curr is null, then we went through the entire list without finding target, so let's just not bother
        // inserting the new element.
        if (curr == null) {
            return head;
        }

        // Otherwise, create a new demos.Node for the element and wire the next pointers up so that curr is followed by
        // newNode, and newNode is followed by what used to come after curr.
        Node newNode = new Node(element);
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);

        return head;
    }

    /**
     * A utility method that inserts an element immediately before the targeted element, if the target exists in the list.
     * @param head The first element in the linked list that links to subsequent elements.
     * @param element Desired element to insert into the list.
     * @param target The target element to insert the new element before.
     * @return The list with the new inserted element.
     */
    public Node insertBefore(Node head, int element, int target) {
        // Find the target demos.Node first. This time, we need to keep track of the previous demos.Node as well, since we need to
        // insert element before the target node.
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            if (curr.getElement() == target) {
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }

        if (curr == null) {
            return head;
        }

        Node newNode = new Node(element);
        if (prev == null) {
            // If prev is null, the while loop above exited immediately in the first iteration, so curr must be the
            // first element in the list. That means we are inserting element at the beginning of the list.
            newNode.setNext(curr);
            head = newNode;
        } else {
            // Otherwise, we are inserting element in the middle or end of the list, in which case newNode should set
            // its next demos.Node to be target, and prev (the demos.Node that used to be just before target) should set its next
            // node to be the new node.
            newNode.setNext(curr);
            prev.setNext(newNode);
        }
        return head;
    }

    /**
     * A utility method used to remove a target element from an integer linked list.
     * @param head The first element in the list that links to the rest of the list.
     * @param target The desired int element to remove from the list.
     * @return The head node with the target element removed from the list.
     */
    public Node removeElement(Node head, int target) {
        // When removing a demos.Node, we need access to the demos.Node that comes before it to change its next pointer, so we use
        // the prev/curr loop again.
        Node prev = null;
        Node curr = head;
        while (curr  != null) {
            if (curr.getElement() == target) {
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }

        if (curr == null) {
            return head;
        }

        if (prev == null) {
            // Removing the first element of the list.
            head = head.getNext();
        } else {
            // Removing an element from the middle or end of the list.
            Node following = curr.getNext();
            prev.setNext(following);
        }
        return head;
    }

    /**
     * A utility method used to remove a target element from a String linked list.
     * @param head The first element in the list that links to the rest of the list.
     * @param target The desired String element to remove from the list.
     * @return The head node with the target element removed from the list.
     */
    public Node removeStringElement(Node head, String target) {
        // When removing a demos.Node, we need access to the demos.Node that comes before it to change its next pointer, so we use
        // the prev/curr loop again.
        Node prev = null;
        Node curr = head;
        while (curr  != null) {
            if (Objects.equals(curr.getWord(), target)) {
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }
        if (curr == null) {
            return head;
        }
        if (prev == null) {
            // Removing the first element of the list. Updating head to the next element.
            head = head.getNext();
        } else {
            // Removing an element from the middle or end of the list.
            Node following = curr.getNext();
            prev.setNext(following);
        }
        return head;
    }

    /**
     * Utility method used to print each node in an integer linked list.
     * @param head The first demos.Node in the linked list to be printed.
     */
    public void printIntList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.getElement());
            curr = curr.getNext();
        }
    }


    /**
     * Utility method used to print each node in a String linked list.
     * @param head The first demos.Node in the desired linked list to be printed.
     */
    public void printStringList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.getWord());
            curr = curr.getNext();
        }
    }

    /**
     * Utility method that creates an integer linked list.
     * @param elements Var-arg of integers that fill the linked list.
     * @return The head/first node in the linked list.
     */
    public Node createIntList(int... elements) {
        Node head = null;
        for (int i = elements.length - 1; i >= 0; i--) {
            Node newNode = new Node(elements[i]);
            newNode.setNext(head);
            head = newNode;
        }
        return head;
    }

    /**
     * Utility method that creates a String linked list.
     * @param elements Var-arg of Strings that fill the linked list.
     * @return The head/first node in the linked list.
     */
    public Node createStringList(String... elements) {
        Node head = null;
        for (int i = elements.length - 1; i >= 0; i--) {
            Node newNode = new Node(elements[i]);
            newNode.setNext(head);
            head = newNode;
        }
        return head;
    }

//    public void moveTailToFront(demos.Node head) {
//        if (head == null || head.getNext() == null) return;
//        demos.Node secLast = null;
//        demos.Node last = head;
//
//        while (last.getNext() != null) {
//            secLast = last;
//            last = last.getNext();
//        }
//
//        last.setNext(head);
//        head = last;
//    }

    /**
     * This method is used to get an element
     * @param head The list to be parsed.
     * @param n The position to pull from the list.
     * @return The value of the element at pos n.
     */
    public int getIntAt(Node head, int n) {
        Node curr = head;
        int count = 0;

        while ( curr != null) {
            if (count == n-1){ return curr.getElement();}
            count++;
            curr = curr.getNext();
        }
        assert (false);
        return 0;
    }

    /**
     * An iterative solution to getting the size of a linked list.
     * @param head The first element in the list to be counted.
     * @return The number of elements in a linked list as an integer.
     */
    public int getCount(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    /**
     * A recursive solution to getting the size of a linked list.
     * @param head List to be counted.
     * @return The number of elements in the list.
     */
    public int getCountRec(Node head) {
        if (head == null) return 0; // Base case
        return 1 + getCountRec(head.getNext()); // Count is this node plus rest of the list
    }

    /**
     * A simple method that takes in a String linked list and concatenates it to a single string.
     * @param head The list to be traversed.
     * @return The contents of a linked list converted to a String seperated by a space.
     */
    public String traverseWords(Node head){
        Node temp = head;
        String str ="";

        while(temp != null){
            if(temp.getNext() != null){
                str = str.concat(temp.getWord()).concat(" ");
            }else{
                str = str.concat(temp.getWord());
            }
            temp = temp.getNext();
        }
        return str;
    }

    /**
     * A simple method that takes in an integer linked list and concatenates it to a single String.
     * @param head The list to be traversed.
     * @return The contents of an integer list converted to a String seperated by a space.
     */
    public String traverseIntList(Node head){
        Node temp = head;
        String str ="";

        while(temp != null){
            if(temp.getNext() != null){
                str = str.concat(Integer.toString(temp.getElement()).concat(" "));
            }else{
                str = str.concat(Integer.toString(temp.getElement()));
            }
            temp = temp.getNext();
        }
        return str;
    }



    public static void main(String[] args) {
        LinkedListDemo test = new LinkedListDemo();
        Node head = test.createIntList(10, 4, 7);


        head = test.insertAfter(head, 8, 10);  // 10, 8, 4, 7
        head = test.insertBefore(head, 3, 10); // 3, 10, 8, 4, 7
        head = test.insertBefore(head, 6, 3);  // 6, 3, 10, 8, 4, 7

        head = test.removeElement(head, 4); // 6, 3, 10, 8, 7
        head = test.removeElement(head, 3); // 6, 10, 8, 7
        head = test.removeElement(head, 7); // 6, 10, 8


        Node headTwo = test.createStringList("Hello","Big", "World", "How Are You"); // Hello, Big, World, How Are You
        headTwo = test.removeStringElement(headTwo, "Big");  // Hello, World, How Are You

        test.printIntList(head);
        test.printStringList(headTwo);
    }
}
