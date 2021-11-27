package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2015, 80, 1000);
        boeing.setYear(2013);
        boeing.setLength(70);
        boeing.info();

        boeing.fillUp(10);
        boeing.fillUp(5);
        boeing.info();
    }
}

class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длинна: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

    public void fillUp (int n){
        fuel = fuel + n;
    }
}
