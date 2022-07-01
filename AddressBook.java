import java.util.Scanner;

public class AddressBook {
         Contact contact;
        Scanner scan = new Scanner(System.in);
        /*
            addContact method is created to add Contact by taking user input
            For creating a successful entry in contact book User has to enter FirstName,LastName,City,State
            ,ZipCode,Phone Number , EmailId
         */
        public void addContact(){
             contact = new Contact();
            System.out.println("Enter First Name");
            String fName = scan.nextLine();

            System.out.println("Enter Last Name");
            String lName = scan.nextLine();

            System.out.println("Enter City");
            String city = scan.nextLine();

            System.out.println("Enter State");
            String state = scan.nextLine();

            System.out.println("Enter ZIP CODE");
            String zipCode = scan.nextLine();

            System.out.println("Enter Phone Number");
            String pNumber = scan.nextLine();

            System.out.println("Enter Email Id");
            String eMail = scan.nextLine();

            contact.setFirstName(fName);
            contact.setLastName(lName);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zipCode);
            contact.setPhone_Number(pNumber);
            contact.setEmail(eMail);

            System.out.println(contact);
        }
        /*
            editContact method is created to edit existing Contact
            User Have to provide FirstName of the contact to delete it
            If provided wrong name it would show you that you had provided invalid value
         */
        public void editContact(){
            System.out.println("Please Enter First Name To Edit Existing Data");
            String editName = scan.nextLine();
            if(editName.equalsIgnoreCase(contact.getFirstName())){
                addContact();
            }else{
                System.out.println("Invalid First Name");
                System.out.println("Please enter Valid first Name");
                editContact();
            }
        }
        /*
            deleteContact method is created to delete the contact created by the user
            User Have to provide FirstName of the contact to delete it
            If provided wrong name it would show you that you had provided invalid value
         */
        public void deleteContact(){
            System.out.println("Please Enter First Name To Delete Existing Data");
            String editName = scan.nextLine();
            if(editName.equalsIgnoreCase(contact.getFirstName())){
                System.out.println("Contact is deleted SuccessFully "+ contact.getFirstName());
                contact = null;

            }else{
                System.out.println("Invalid First Name");
                System.out.println("Please enter Valid first Name");
                deleteContact();
            }
        }
        /*
            displayContact() would use contact object to display it in the console
         */
        public void displayContact(){
            System.out.println(contact);
        }
}
