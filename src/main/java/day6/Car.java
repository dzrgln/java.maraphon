package day6;

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

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifferece(int imputYear) {
        if (imputYear > this.getAgeRealise()) {
            int a = imputYear - this.ageRealise;
            return a;
        } else {
            int b = this.ageRealise - imputYear;
            return b;
        }
    }

}