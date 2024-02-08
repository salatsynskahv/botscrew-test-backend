package com.university.entities;

import com.university.exceptions.DegreeNotUpgradable;

import java.util.Arrays;

public enum Degree {
    ASSISTANT(1),
    ASSOCIATE_PROFESSOR(2),
    PROFESSOR(3);

    private final int value;

    Degree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Degree getByValue(int value) {

        return Arrays.stream(Degree.values())
                .filter(degree -> degree.value == value)
                .findFirst()
                .orElseThrow(() -> new DegreeNotUpgradable("Could not find degree with value " + value));
    }
}
