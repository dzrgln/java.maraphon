package day6;


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

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifferece(int imputYear) {
            return Math.abs(imputYear - this.ageRealise);
        }
    }
