package com.example;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testGetUserById_ReturnsUser() {
        // Arrange
        Long userId = 1L;
        User mockUser = new User();
        mockUser.setId(userId);
        mockUser.setName("Ajay");

        when(userRepository.findById(userId)).thenReturn(Optional.of(mockUser));

        // Act
        User result = userService.getUserById(userId);

        // Assert
        assertEquals("Ajay", result.getName());
        assertEquals(userId, result.getId());
    }
}
