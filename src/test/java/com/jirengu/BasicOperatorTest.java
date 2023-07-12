package com.jirengu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicOperatorTest {
    PrintStream originalOut;
    ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testBasicOperator() {
        // Act
        BasicOperator.main(null);

        // Assert
        String output = outputStream.toString().trim();
        assertEquals(96, Integer.parseInt(output));
    }

}
