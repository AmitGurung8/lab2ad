package com.example.lab2aj;

public class Burger {
    private String name;
    private double price;
    private int calories;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The burger must have a name.");
        }
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("The price must be greater than 0.");
        }
        this.price = price;
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories <= 0) {
            throw new IllegalArgumentException("Calories must be greater than 0.");
        }
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Your Burger details:\n" +
                "name = '" + name + '\'' + "\n" +
                "price = $" + price + "\n" +
                "calories = " + calories + "\n"
                ;
    }

}
