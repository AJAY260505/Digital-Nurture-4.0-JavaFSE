package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodInteraction() {
        LoggerService mockLogger = mock(LoggerService.class);

        doNothing().when(mockLogger).log(anyString());

        MyService service = new MyService(mockLogger);
        service.process();

        verify(mockLogger).log("Process executed");
    }
}
