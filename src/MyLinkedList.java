import java.sql.SQLOutput;
import java.util.List;

public class MyLinkedList {
    ListNode head;
    private ListNode end;
    private ListNode current;

    public void add(String data) { // pass in multiple data points into a node (can store multiple data points in same node)
        ListNode node = new ListNode();
        node.data = data;
        node.next = null;

        if (head == null) { // if the head of list is null, set the head of list as node
            head = node;
        } else {
            ListNode newNode = head;  // start newNode as the head
            while(newNode.next != null) { // keeps jumping until it finds end node
                newNode = newNode.next;
            }
            newNode.next = node; // sets end node value
        }
    }

    public void print() {
        ListNode node = head;

        while (node != null) {
            System.out.println("Phonebook Entry: ");
            System.out.println(node.data);
            System.out.println();
            node = node.next;
        }
    }
}
