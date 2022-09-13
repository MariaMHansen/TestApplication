import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() throws Exception {
        Assertions.assertEquals("hello world!", HelloWorld.greet());
    }
}