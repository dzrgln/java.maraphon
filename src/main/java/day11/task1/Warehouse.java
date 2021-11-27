package day11.task1;

public class Warehouse {

    private int countPickedOrders; //Количество собранных заказаов
    private int countDeliverOrders; //Количество доставленных заказов

    public int getCountDeliverOrders() {
        return countDeliverOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public String toString(){
        return countPickedOrders + " " + countDeliverOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliverOrders(int countDeliverOrders) {
        this.countDeliverOrders = countDeliverOrders;
    }
}
