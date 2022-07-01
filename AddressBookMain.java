import java.util.Scanner;

public class AddressBookMain {
    /*
        Below Method Consists The Functionality To choose from 4 different Options Whether
        We want to Delete, Create or Display The Contact List
        Also if the User is user not providing the input as per the expectation program would automatically exit
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();    //Creating Object of AddressBook To Access Methods Present Inside It
        addressBook.addContact();
        System.out.println("Press 1 to edit the data \n Press 2 to delete the existing contact \n Press 3 to Display data" +
                "\n press 4 to exit program");
        int input = scanner.nextInt();
        /*
            Using Switch Case To Ask User Preference From the given Choices
         */
            switch(input){
                case 1 :
                    System.out.println("Please enter the following data : ");
                    addressBook.editContact();      //Edit Contact
                    break;
                case 2 :
                    addressBook.deleteContact();    //Delete Contact
                    break;
                case 3 :
                    addressBook.displayContact();   //Display Contact
                    break;
                case 4 :
                    System.out.println("Program is exiting....");   //For Exiting Contact
                    break;
                default:
                    System.out.println("Please provide correct input program is exiting");
            }
    }
}
