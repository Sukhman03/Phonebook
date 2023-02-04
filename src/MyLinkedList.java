import java.util.List;
import java.util.Scanner;

public class MyLinkedList {
    private ListNode head;
    private int totalEntryCount; // tracks amount of entries in phonebook

    public MyLinkedList() {
        totalEntryCount = 0;
    }
    public void add(String fName, String lName, String pNumber, String city, String address) {
        ListNode node = new ListNode();
        node.fName = fName;
        node.lName = lName; // assign String values from PB entry into the node
        node.pNumber = pNumber;
        node.address = address;
        node.city = city;
        node.next = null;

        if (head == null) { // if the head of list is null, set the head of list as node
            head = node;
        } else {
            ListNode newNode = head;  // start newNode as the head
            while (newNode.next != null) { // keeps jumping until it finds end node
                newNode = newNode.next;
            }
            newNode.next = node; // sets end node value
        }
        totalEntryCount++;
    }

    public void print() {
        ListNode node = head;
        int count = 1;
        while (node != null) {
            System.out.println("Phonebook Entry #" + count);
            System.out.println("Name: " + node.lName + ", " + node.fName);
            System.out.println("Phone Number: " + node.pNumber);
            System.out.println("Address: " + node.address);
            System.out.println("City: " + node.city);
            System.out.println();
            count++;
            node = node.next;
        }
    }

    public void search(int index) {
        Scanner scan = new Scanner(System.in);
        ListNode node = head;
        while (true) { // if they ask for an entry that doesn't exist
            if (index> totalEntryCount || index < 0) {
                System.out.println("Please enter a valid entry 1-" + totalEntryCount + ": ");
                index = scan.nextInt();
            } else {
                break;
            }
        }
        int count = 1;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
            count++;
        }
        System.out.println("Phonebook Entry #" + count);
        System.out.println("Name: " + node.lName + ", " + node.fName);
        System.out.println("Phone Number: " + node.pNumber);
        System.out.println("Address: " + node.address);
        System.out.println("City: " + node.city);
        System.out.println();
    }

    public void addAtStart(String fName, String lName, String pNumber, String city, String address) {
        ListNode node = new ListNode();
        node.fName = fName;
        node.lName = lName; // assign String values from PB entry into the node
        node.pNumber = pNumber;
        node.address = address;
        node.city = city;
        node.next = null;
        node.next = head;
        head = node;
        totalEntryCount++;
    }

    public void addAt(int index, String fName, String lName, String pNumber, String city, String address) {
        ListNode node = new ListNode();
        node.fName = fName;
        node.lName = lName; // assign String values from PB entry into the node
        node.pNumber = pNumber;
        node.address = address;
        node.city = city;
        node.next = null;
        if (index == 0) { // if they try to add at start
            addAtStart(fName, lName, pNumber, city, address);
        }
        ListNode newNode = head;
        for (int i = 1; i < index - 1; i++) {
            newNode = newNode.next;
        }
        node.next = newNode.next;
        newNode.next = node;
        totalEntryCount++;

    }

    public void deleteAt(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            ListNode newNode = head;
            ListNode n = null;
            for (int i = 1; i< index - 1; i++) {
                newNode = newNode.next;
            }
            n = newNode.next;
            newNode.next = n.next;
        }

    }
}
