package dev.drf.java14.features.test;

import dev.drf.java14.features.test.npe.NewNullPointerTest;
import dev.drf.java14.features.test.patternmatching.PatternMatchingTest;
import dev.drf.java14.features.test.record.RecordTest;
import dev.drf.java14.features.test.switchexp.SwitchExpressionTest;
import dev.drf.java14.features.test.textblock.TextBlockTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        FeatureTest test;

        System.out.println(">>> RECORD TEST");
        test = new RecordTest();
        test.processTest();

        System.out.println(">>> NEW NULL POINTER");
        test = new NewNullPointerTest();
        test.processTest();

        System.out.println(">>> TEXT BLOCK");
        test = new TextBlockTest();
        test.processTest();

        System.out.println(">>> SWITCH EXPRESSION");
        test = new SwitchExpressionTest();
        test.processTest();

        System.out.println(">>> PATTERN MATCHING");
        test = new PatternMatchingTest();
        test.processTest();
    }
}
