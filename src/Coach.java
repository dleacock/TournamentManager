import java.io.Serializable;

public class Coach extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contact;
    private int yearsActive;

    public Coach() {

    }

    public Coach(String firstName, String lastName, int yearsActive, String contact) {
        super(firstName, lastName);

        this.contact = contact;
        this.yearsActive = yearsActive;
    }

    public String toString() {
        return "Name: " + super.firstName + " " + lastName + "\n"
                + "Contact Info: " + this.contact + "\n"
                + "Years as Coach: " + this.yearsActive + "\n";
    }

}