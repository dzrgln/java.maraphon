package day5;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setModel("Ford Fusion");
        ford.setColor("Black");
        ford.setAgeRealise(2012);

        System.out.println("Автомобиль: " + ford.getModel());
        System.out.println("Цвет: " + ford.getColor());
        System.out.println("Год выпуска: " + ford.getAgeRealise());
    }
}

class Car {
    private String model;
    private String color;
    private int ageRealise;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAgeRealise(int ageRealise) {
        this.ageRealise = ageRealise;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAgeRealise() {
        return ageRealise;
    }
}