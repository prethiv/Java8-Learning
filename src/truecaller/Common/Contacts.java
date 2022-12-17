package truecaller.Common;

public class Contacts {
    public String id;
    public String phoneNumber;
    public PersonalInfo personalInfo;

    public Contacts(String id, String phoneNumber, PersonalInfo personalInfo) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.personalInfo = personalInfo;
    }
}
