// File: src/test/java/com/example/UserServiceParameterizedTest.java
package com.example;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserServiceParameterizedTest {

    @Autowired
    private UserRepository userRepository;

    @ParameterizedTest
    @ValueSource(strings = {"Ajay", "Vikram", "Sneha", "Priya"})
    public void testFindByName(String name) {
        // Arrange: Save a user with the given name
        User user = new User();
        user.setName(name);
        user.setEmail(name.toLowerCase() + "@example.com");
        userRepository.save(user);

        // Act: Retrieve by name
        List<User> result = userRepository.findByName(name);

        // Assert
        assertThat(result).isNotEmpty();
        assertThat(result.get(0).getName()).isEqualTo(name);
    }
}
