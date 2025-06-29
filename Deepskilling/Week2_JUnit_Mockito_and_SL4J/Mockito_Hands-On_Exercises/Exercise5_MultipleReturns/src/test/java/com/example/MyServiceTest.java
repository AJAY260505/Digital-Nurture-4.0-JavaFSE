package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testMultipleReturnsFromMock() {
        ExternalApi mockApi = mock(ExternalApi.class);

        // Return different values on each call
        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call");

        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchFirstData());
        assertEquals("Second Call", service.fetchSecondData());

        // Verifies it was called twice
        verify(mockApi, times(2)).getData();
    }
}
