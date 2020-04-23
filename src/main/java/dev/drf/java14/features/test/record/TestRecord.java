package dev.drf.java14.features.test.record;

public record TestRecord<T>(long id, String name, T value) {
}
