package phoneBook;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

//@ToString
@NoArgsConstructor
public class Node {
    Node next;
    String name;
    String lastName;
    String email;
    String phoneNumber;

    public Node(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
