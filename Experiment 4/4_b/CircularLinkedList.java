class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node tail;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // circular
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (tail == null) return;
        Node head = tail.next;
        if (head == tail) { // only one node
            tail = null;
            return;
        }
        tail.next = head.next;
    }

    // Delete at end
    void deleteAtEnd() {
        if (tail == null) return;
        Node temp = tail.next;
        if (tail == tail.next) { // only one node
            tail = null;
            return;
        }
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;
    }

    // Display the list
    void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail.next;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtBeginning(10);
        cll.insertAtBeginning(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);

        System.out.print("Circular Linked List: ");
        cll.display();

        cll.deleteAtBeginning();
        System.out.print("After deleting at beginning: ");
        cll.display();

        cll.deleteAtEnd();
        System.out.print("After deleting at end: ");
        cll.display();
    }
}
