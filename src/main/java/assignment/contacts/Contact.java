package assignment.contacts;
import java.util.*;
import java.util.logging.Logger;

public class Contact {
    public static void main(String[] args) {

        
    	Logger l = Logger.getLogger("contacts");
    	Scanner inp = new Scanner(System.in);
    	ContactLogic obj = new ContactLogic();
        
        boolean con = true;
        while (con)
        {
            l.info("enter chioce\n1 -> insert a contact\n2 -> delete a contact\n3 -> search a contact\n4 -> Display all contacats\n5 -> Exit");
            int choice = inp.nextInt();
            switch (choice) {
                case 1:
                	obj.insertContact();

                    
                    break;
                case 2:
                	obj.deleteContact();
                    
                    break;
                case 3:
                	obj.searchContact();
                    
                    break;

                case 4:
                	obj.displayAllContacts();
  

                    break;
                default:
                    l.info("Invalid choice");
                    con = false;
                    break;
            }
            if (choice == 5) {
                break;
            }
        }
    }


}

