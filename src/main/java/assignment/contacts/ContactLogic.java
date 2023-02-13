package assignment.contacts;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ContactLogic {
	LinkedList<Details1> ll = new LinkedList<Details1>();
	Logger l = Logger.getLogger("contacts");
	Scanner inp = new Scanner(System.in);
	
	void insertContact() {
		int size = ll.size();

        l.info("enter Name:");
        String name = inp.next();

        l.info("enter Phone:");
        String phone = inp.next();
        l.info("enter Email:");
        String email = inp.next();
        int i = 0;
        Details1 ob1 = new Details1(name, phone, email);
        if (size > 0)
        {
            for (Details1 element : ll)
            {
                String nam = element.name;
                l.info(nam);
                if (nam.equals(name)||element.phone.equals(phone) || element.email.equals(email))
                {
                    l.info("This name or phone number or email is already given");
                }
                else
                {
                    i++;
                    break;
                }
            }
            if (i == size)
            {
                ll.add(ob1);
            }
        }
        else
        {
            ll.add(ob1);
        }
	}
	
		
	
	void deleteContact() {
		int i=-1;
        if(ll.isEmpty())
        {
            l.info("Contacct is empty");
        }
        else
        {
            l.info("enter the contact name to delete");
            String chkname = inp.next();
            for (Details1 element : ll)
            {
                i++;
                if (element.name.equals(chkname))
                {
                    ll.remove(i);
                    l.info("Contact removed");
                }
            }
        }
	}
	
	
	
	void searchContact() {
		if(ll.isEmpty())
        {
            l.info("Contact is empty");
        }
        else
        {
            l.info("enter the contact name to search");
            String schname = inp.next();
            for (Details1 element : ll)
            {
                if (element.name.equals(schname))
                {
                    l.log(Level.INFO, ()->"Name:"+element.name+"\nPhone Number:"+element.phone+"\nEmail"+element.email);
                    l.info("Contact searched");
                    break;
                }
            }
        }
	}
	
	
	void displayAllContacts() {
        if(ll.isEmpty())
        {
            l.info("Contacct is empty");
        }
        else
        {
            for (Details1 element : ll)
                l.log(Level.INFO, ()->"Name:"+element.name+"\nPhone Number:"+element.phone+"\nEmail:"+element.email);

        }
	}

}

 class Details1
{
    String name;
    String phone;
    String email;
    Details1(String name,String phone,String email)
    {
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
}


