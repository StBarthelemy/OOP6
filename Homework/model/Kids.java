package model;

public class Kids extends User {
    private int KidsId;

    public Kids(String firstName, String secondName, String lastName, int kidsId) {
        super(firstName, secondName, lastName);
        KidsId = kidsId;
    }

    public int getKidsId() {
        return KidsId;
    }

    public void setKidsId(int kidsId) {
        KidsId = kidsId;
    }

    @Override
    public String toString() {
        return "Kids{" +
        "KidsId=" + KidsId +
        "firstName=" + super.getFirstName() +
        ", secondName=" + super.getSecondName() +
        ", lastName=" + super.getLastName() + "}";
    }
    
}
