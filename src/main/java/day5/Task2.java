package day5;


public class Task2 {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", "Blue", 2020);

        System.out.println("Автомобиль: " + bike.getModel());
        System.out.println("Цвет: " + bike.getColor());
        System.out.println("Год выпуска: " + bike.getAgeRealise());
    }
}

class Bike {
    private String model;
    private String color;
    private int ageRealise;

    public Bike(String model, String color, int ageRealise) {
        this.model = model;
        this.color = color;
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