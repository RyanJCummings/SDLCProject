package com.sdlc.project.Formatters;

import org.springframework.web.bind.annotation.PathVariable;

public class MathFormatter {
    public static int performAdd(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int performSubtract(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    public static int performMultiply(String a, String b) {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    public static double performDivide(String a, String b) {
        return Double.parseDouble(a) / Double.parseDouble(b);
    }
}
