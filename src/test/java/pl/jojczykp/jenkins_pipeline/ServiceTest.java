package pl.jojczykp.jenkins_pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceTest {

    private Service service = new Service();

    @Test
    void shouldSayHello() {
        String result = service.sayHello();

        assertEquals("Hello!", result);
    }
}
