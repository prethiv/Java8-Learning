package truecaller.Common;

import java.util.List;

public class Person {
    public String id;
    public String name;
    public String phoneNumber;
    public PersonalInfo personalInfo;
    public List<Contacts> contactsList;
    public List<Contacts> blockedContacts;
    public List<Contacts> spamReportedContacts;
}
