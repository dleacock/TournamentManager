import java.io.Serializable;

public class Player extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String position;
    private int age;

    public Player() {

    }

    public Player(String firstName, String lastName, int age, String position) {
        super(firstName, lastName);

        this.age = age;
        this.position = position;
    }

    public String toString() {
        return "Name: " + super.firstName + " " + lastName + "\n"
                + "Age: " + this.age + "\n"
                + "Position: " + this.position + "\n";
    }

}
