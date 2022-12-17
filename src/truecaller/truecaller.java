package truecaller;

import truecaller.Common.Call;
import truecaller.Common.Contacts;
import truecaller.Common.Person;
import truecaller.core.ContactNotFoundException;

import java.util.List;

import static truecaller.core.coreHandler.*;

public class truecaller implements trueCallercore {

    public List<Contacts> blockedContacts;
    public List<Contacts> spamContacts;
    @Override
    public Person identifyCall(Call call) {
        return getCaller(call);
    }

    @Override
    public void blockIncomingCall(Call call) {
        if(blockedContacts.stream().anyMatch(contacts -> {
            return contacts.id.equals(call.callerid);
        })){
            cutTheCall();
        }
    }

    public boolean isSpam(Call call){
        List<Contacts> spamContacts = getSpamContacts();
        return spamContacts.parallelStream().anyMatch(contacts -> {
            return contacts.id.equals(call.callerid);
        });
    }

    public void addNewContact(Contacts contact){
        System.out.println("Added a new contact contact info :"+contact.toString());
    }

    public Contacts searchContact(String name)throws ContactNotFoundException {
        List<Contacts> localContacts = getLocalContacts();
        for(int i=0;i<localContacts.size();i++){
            if(localContacts.get(i).personalInfo.firstName.equals(name)){
                return localContacts.get(i);
            }
        }
        throw new ContactNotFoundException("Contact Not found for "+name);
    }

    public Contacts searchContact(long phoneNumber)throws ContactNotFoundException {
        List<Contacts> localContacts = getLocalContacts();
        for(int i=0;i<localContacts.size();i++){
            if(localContacts.get(i).phoneNumber.equals(phoneNumber)){
                return localContacts.get(i);
            }
        }
        throw new ContactNotFoundException("Contact Not Found for "+ String.valueOf(phoneNumber));
    }


}
