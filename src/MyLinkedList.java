public class MyLinkedList {
    ListNode head;
    private int count;

    public MyLinkedList() {
        count = 1;
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
            while(newNode.next != null) { // keeps jumping until it finds end node
                newNode = newNode.next;
            }
            newNode.next = node; // sets end node value
        }
    }

    public void print() {
        ListNode node = head;

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
}
