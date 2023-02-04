import java.util.Scanner;

public class Phonebook {
    MyLinkedList list = new MyLinkedList(); // this is not private because it needs to be shared
    static Phonebook bookManage = new Phonebook();
    private static int command;
    private int totalEntryCount;
    private static boolean menuLoop;

    public Phonebook() {
        this.menuLoop = true;
        totalEntryCount = 0;
    }
    public void getInfo(int addToLocation) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the contact info:");
        System.out.println("\nFirst Name: ");
        String fName = scan.nextLine();
        System.out.println("Last Name: ");
        String lName = scan.nextLine();
        System.out.println("Phone Number: ");
        String pNumber = scan.nextLine();
        System.out.println("City: ");
        String city = scan.nextLine();
        System.out.println("Address: ");
        String address = scan.nextLine();

        if (addToLocation == 1) {
            totalEntryCount++;
           list.addAtStart(fName, lName, pNumber, city, address); // add to strt
        } else if (addToLocation == 2) {
            System.out.println("Please enter an index number for entry: ");
            int index = scan.nextInt();
                while (true) { // if they ask for an entry that doesn't exist
                    if (index> totalEntryCount || index < 0) {
                        System.out.println("Please enter a valid entry 1-" + totalEntryCount + ": ");
                        index = scan.nextInt();
                    } else {
                        break;
                    }
                }
            totalEntryCount++;
            list.addAt(index, fName, lName, pNumber, city, address); // add to index
        } else {
            totalEntryCount++;
            list.add(fName, lName, pNumber, city, address); // add to end
        }
    }

    public void deleteContact() {
        
    }

    public void menu() {
        System.out.println("\nPlease select a command: ");
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Print Phonebook");
        System.out.println("5. Exit");
    }

    public void manageMenu() {
        while (menuLoop = true) {
            bookManage.menu();
            Scanner input = new Scanner(System.in);
            while (true) {
                command = input.nextInt();
                if (command > 5 || command < 1) {
                    System.out.println("Invalid input entered.");
                    bookManage.menu();
                } else {
                    break;
                }
            }

            switch (command) {
                case 1:
                    addToLocation();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
            }
        }
    }

    public static void addToLocation() {
        Scanner console = new Scanner(System.in);
        int addLocate;
        System.out.println("\nPlease select a location for the entry:");
        System.out.println("1. Add to Start");
        System.out.println("2. Add to Middle");
        System.out.println("3. Add to End");
        while (true) {
            addLocate = console.nextInt();
            if (addLocate < 1 || addLocate > 3) {
                System.out.println("Invalid input entered.");
                addToLocation();
            } else {
                break;
            }
        }
        bookManage.getInfo(addLocate);
    }
}
