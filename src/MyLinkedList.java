
public class MyLinkedList {
    private ListNode head;

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
        ListNode node = head;
        int count = 1;
        for (int i = 1; i < index - 2; i++) {
            node = node.next;
            count++;
        }
        System.out.println("Phonebook Entry #" + count);
        System.out.println("Name: " + node.lName+ ", " + node.fName);
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
    }

    public void addAt(int index, String fName, String lName, String pNumber, String city, String address) {
        ListNode node = new ListNode();
        node.fName = fName;
        node.lName = lName; // assign String values from PB entry into the node
        node.pNumber = pNumber;
        node.address = address;
        node.city = city;
        node.next = null;
        if (index == 0 || head == null) { // if they try to add at start or list is empty
            addAtStart(fName, lName, pNumber, city, address);
        } else {
            ListNode newNode = head;
            for (int i = 1; i < index - 1; i++) {
                newNode = newNode.next;
            }
            node.next = newNode.next;
            newNode.next = node;
        }
    }

    public void deleteAt(int index) {
            if (index == 0) {
                index++;
            }
            if (index == 1) {
                head = head.next;
            } else {
                ListNode newNode = head;
                ListNode n = null;
                for (int i = 1; i < index - 2; i++) {
                    newNode = newNode.next;
                }
                n = newNode.next;
                newNode.next = n.next;
            }
    }
}
