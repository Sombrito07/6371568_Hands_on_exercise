package junit.aaapattern;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class User {
    String name;
    public User(String name) {
        this.name = name;
    }
    String greet() {
        return "Hello, " + name;
    }
}

public class UserTest {

    User user;

    @BeforeEach
    void setup() {
        user = new User("Sombrito");
    }

    @Test
    void testGreeting() {
        String greeting = user.greet();
        assertEquals("Hello, Sombrito", greeting);
    }

    @AfterEach
    void teardown() {
        user = null;
    }
}
