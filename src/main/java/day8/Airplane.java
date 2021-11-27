package day8;

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
        System.out.println("Длина: " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }

    public static void compareLength(Airplane a, Airplane b){
        if(a.length>b.length){
            System.out.println("Самолет " + a.producer + " длиннее");
        }else {
            System.out.println("Самолет " + b.producer + " длиннее");
        }
    }

    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}
