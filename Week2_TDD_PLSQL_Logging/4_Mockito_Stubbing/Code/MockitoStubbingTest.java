package mockito.stubbing;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

interface Database {
    int getUserCount();
}

public class MockitoStubbingTest {

    @Test
    void testStubbing() {
        Database mockDb = mock(Database.class);
        when(mockDb.getUserCount()).thenReturn(42);

        assertEquals(42, mockDb.getUserCount());
    }
}
