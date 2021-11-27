package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse myWarehouse;

    @Override
    public String toString() {
        return "Courier{" +
                "Зарплата=" + salary +
                ", Бонус=" + isPayed +
                '}';
    }

    public Courier(Warehouse warehouse) {
        myWarehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


    @Override
    public void doWork() {
        this.salary = this.salary + 100;
        myWarehouse.setCountDeliverOrders(myWarehouse.getCountDeliverOrders() + 1);
    }

    @Override
    public void bonus() {
        if(!this.isPayed) {
            if (myWarehouse.getCountDeliverOrders() < 10000) {
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
