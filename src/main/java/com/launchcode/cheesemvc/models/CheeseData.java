package com.launchcode.cheesemvc.models;

import java.util.ArrayList;

public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    public static void add(Cheese cheese) {
        cheeses.add(cheese);
    }

    public static void remove(int id) {
        Cheese cheese = getById(id);
        cheeses.remove(cheese);
    }

    public static Cheese getById(int id) {
        Cheese cheese = null;

        for(Cheese candidateCheese : cheeses) {
            if(candidateCheese.getId() == id) {
                cheese = candidateCheese;
            }
        }

        return cheese;
    }
}
