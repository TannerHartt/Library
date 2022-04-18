package demos;

public class Node { // demos.Node constructor class
    private int element;
    private String word;
    private Node next;

    public Node(int element) {  // Used when creating a linked list of integers.
        this.element = element;
        this.next = null;
    }

    public Node(String word) {  // Used when creating a linked list of Strings.
        this.word = word;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setWord(String word) {this.word = word;}

    public String getWord() {return word;}
}
