package truecaller.core;

import truecaller.Common.Call;
import truecaller.Common.Contacts;
import truecaller.Common.Person;
import truecaller.Common.PersonalInfo;

import java.util.ArrayList;
import java.util.List;

public class coreHandler {
    public static Person getCaller(Call call){
        return binarySearchByCall_FindCaller(call);
    }

    public static Person binarySearchByCall_FindCaller(Call call){
        Person person = new Person();
        person.name = "ABC";
        return person;
    }

    public static void cutTheCall(){
        System.out.println("Call Cutted Successfully");
    }

    public static List<Contacts> getSpamContacts(){
        System.out.println("Getting spam contacts list");
        List<Contacts> spamContacts = new ArrayList<>();
        spamContacts.add(new Contacts("id1","8072794876",new PersonalInfo()));
        return spamContacts;
    }

    public static List<Contacts> getLocalContacts(){
        System.out.println("Getting spam contacts list");
        List<Contacts> localContacts = new ArrayList<>();
        localContacts.add(new Contacts("id1","8072794876",new PersonalInfo()));
        return localContacts;
    }
}
