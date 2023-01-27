import java.util.Scanner;

public class Phonebook {
    MyLinkedList list = new MyLinkedList();
    public void getInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = scan.nextLine();
        System.out.println("Last Name: ");
        String lName = scan.nextLine();
        System.out.println("Phone Number: ");
        String pNumber = scan.nextLine();
        System.out.println("City: ");
        String city = scan.nextLine();
        System.out.println("Address: ");
        String address = scan.nextLine();

        list.add(fName, lName, pNumber, city, address);
    }
}
