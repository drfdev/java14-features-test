package dev.drf.java14.features.test.record;

import dev.drf.java14.features.test.FeatureTest;

import java.util.Objects;

public final class RecordTest implements FeatureTest {
    @Override
    public void processTest() {
        // javac --enable-preview --release 14 RecordTest.java
        TestRecord<String> recordString = new TestRecord<>(1L, "string", "string record");
        TestRecord<Integer> recordInteger = new TestRecord<>(1L, "age", 12);

        TestRecord<Integer> recordEqual = new TestRecord<>(1L, "age", 12);

        System.out.println(recordString.toString());
        System.out.println(recordInteger);
        System.out.println(Objects.equals(recordEqual,recordInteger));

        System.out.println(Objects.equals(recordInteger.hashCode(), recordEqual.hashCode()));
    }
}
