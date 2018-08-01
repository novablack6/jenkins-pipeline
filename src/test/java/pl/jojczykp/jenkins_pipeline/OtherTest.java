package pl.jojczykp.jenkins_pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class OtherTest {

    @Test
    void shouldPrintAndPass() {
        System.out.println("Print to stdout");
        System.err.println("Print to stderr");
    }

    @Test
    void shouldPrintAndFail() {
        System.out.println("Print to stdout");
        System.err.println("Print to stderr");
        fail("Oooopppsss....");
    }
}
