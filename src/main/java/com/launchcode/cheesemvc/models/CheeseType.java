package com.launchcode.cheesemvc.models;

public enum CheeseType {
    HARD ("Hard"),
    SOFT ("Soft"),
    NORMAL ("Fake");

    private final String name;

    CheeseType (String name) {
        this.name = name;
    }

}
