package com.sdlc.project;

import com.sdlc.project.Formatters.MathFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathControllerTests {


    @Test
    void addTest() {
        assertEquals(3, MathFormatter.performAdd("1", "2"), "One plus two should be 3");
    }

    void addTest_nonnumericInput() {
        // test that the error is handled when a non-numeric input is added
        //assertEquals(error)
    }
}
