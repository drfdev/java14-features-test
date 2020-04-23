package dev.drf.java14.features.test.patternmatching;

import dev.drf.java14.features.test.FeatureTest;

public final class PatternMatchingTest implements FeatureTest {
    @Override
    public void processTest() {
        Object value = "String value";

        if (value instanceof String obj) {
            System.out.println(obj.length());
        }
    }
}
