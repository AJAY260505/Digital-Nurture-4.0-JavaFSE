package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData(anyString())).thenReturn("Mocked Response");

        MyService service = new MyService(mockApi);
        service.fetchDataByKey("user123");

        // Verify the method was called with the exact argument
        verify(mockApi).getData(eq("user123"));
    }
}
