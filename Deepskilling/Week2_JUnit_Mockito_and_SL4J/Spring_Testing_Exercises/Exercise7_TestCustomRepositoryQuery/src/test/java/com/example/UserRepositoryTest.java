package com.example.repository;

import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        // Arrange
        User user1 = new User("Ajay", "ajay@example.com");
        User user2 = new User("Ajay", "ajay2@example.com");
        User user3 = new User("John", "john@example.com");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // Act
        List<User> result = userRepository.findByName("Ajay");

        // Assert
        assertThat(result).hasSize(2);
        assertThat(result).allMatch(user -> user.getName().equals("Ajay"));
    }
}
