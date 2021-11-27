package day11.task1;

public class Task1 {
    public static void main(String[] args) {

//Склад Озона
        Warehouse ozon = new Warehouse();
        Picker oPick1 = new Picker(ozon);
        Courier oCour1 = new Courier(ozon);

        businessProcess(oPick1);
        businessProcess(oCour1);

//Склад Озона
        Warehouse wildberries = new Warehouse();
        Picker wPick1 = new Picker(wildberries);
        Courier wCour1 = new Courier(wildberries);

        businessProcess(wPick1);
        businessProcess(wCour1);

        System.out.println("Количество собранных товаров озон: " + ozon.getCountPickedOrders());
        System.out.println("Количество доставленных товаров озон: " + ozon.getCountPickedOrders());
        System.out.println("Зарплата сборщика озон: " + oPick1.getSalary());
        System.out.println("Зарплата доставщика озон: " + oCour1.getSalary());

        System.out.println("Количество собранных товаров Wildberries: " + wildberries.getCountPickedOrders());
        System.out.println("Количество доставленных товаров Wildberries: " + wildberries.getCountPickedOrders());
        System.out.println("Зарплата сборщика Wildberries: " + wPick1.getSalary());
        System.out.println("Зарплата доставщика Wildberries: " + wCour1.getSalary());

//        for (int i = 0; i < 10000; i++) {
//            oPick1.doWork();
//        }
//        oPick1.bonus();
//        System.out.println("Количество собранных товаров: " + ozon.getCountPickedOrders());
//        System.out.println("Зрплата: " + oPick1.getSalary());
//        System.out.println("Величина бонуса: " + oPick1.getIsPayedisPayed());
    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
