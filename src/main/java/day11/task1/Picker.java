package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    private Warehouse myWarehouse;


    public boolean getIsPayedisPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "Зарплата=" + salary +
                ", Бонус=" + isPayed +
                ", Склад=" + myWarehouse +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.myWarehouse = warehouse;
    }

    public void doWork() {
        this.salary = this.salary + 80;
        myWarehouse.setCountPickedOrders(myWarehouse.getCountPickedOrders() + 1);
    }

    public void bonus() {
        if(!this.isPayed) {
            if (myWarehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не допступен");
            } else {
                this.isPayed = true;
                this.salary = this.salary + 70000;
            }
        }else {
            System.out.println("Бонус уже выплачен");
        }
    }

}
