package truecaller.core;

import truecaller.Common.Contacts;

public class ContactNotFoundException extends Exception{
    public ContactNotFoundException(String exception){
        super(exception);
    }
}
