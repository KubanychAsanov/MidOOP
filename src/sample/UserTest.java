package sample;

import org.junit.jupiter.api.Test;
import sample.javafiles.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("Kubanych", "Asanov","kuba", "12345", "Male");

    @Test
    void getFirstName() {
        assertEquals("Kubanych", user.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Asanov", user.getLastName());
    }

    @Test
    void getUserName() {
        assertEquals("kuba", user.getUserName());
    }

    @Test
    void getPassword() {
        assertEquals("12345", user.getPassword());
    }

    @Test
    void getGender() {
        assertEquals("Male", user.getGender());
    }
}