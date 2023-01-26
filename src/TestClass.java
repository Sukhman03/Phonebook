import java.sql.SQLOutput;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        String entry = getInfo();
        list.add(entry);
        entry = getInfo();
        list.add(entry);

        list.print();
        }

        public static String getInfo() {
            Scanner scan = new Scanner(System.in);
            System.out.println("First Name: ");
            String fName = scan.nextLine();
            System.out.println("Last Name: ");
            String lName = scan.nextLine();;
            System.out.println("Address: ");
            String address = scan.nextLine();
            System.out.println("Phone Number: ");
            String pNumber = scan.nextLine();

            return fName + " " + lName + "\n" + address + "\n" + pNumber; // use the new line/comma depending on
        }                                                                     // how to print
    }
