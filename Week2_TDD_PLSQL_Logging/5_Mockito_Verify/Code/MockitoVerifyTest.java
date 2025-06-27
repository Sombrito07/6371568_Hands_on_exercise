package mockito.verify;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

interface EmailService {
    void sendEmail(String user);
}

public class MockitoVerifyTest {
    @Test
    void testVerifySendEmail() {
        EmailService emailService = mock(EmailService.class);
        emailService.sendEmail("sombrito@example.com");

        verify(emailService).sendEmail("sombrito@example.com");
    }
}

