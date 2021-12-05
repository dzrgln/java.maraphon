package FinalProject.Ships;

import FinalProject.Game.Battlefield;
import FinalProject.Game.Player;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<List<Point>> shipsOfFleet = new ArrayList<>();

    public List<List<Point>> getShipsOfFleet() {
        return shipsOfFleet;
    }

    public void addFleet(Player player, Battlefield battlefield) {
        System.out.println(player.getName() + " создает свой великолепный флот!");

        System.out.println("Введи координаты первого однопалубного корабля (формат x1,y1)");
        Ship singleDeck1 = new Ship() {};
        singleDeck1.addShip(battlefield, 1);
        shipsOfFleet.add(singleDeck1.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты второго однопалубного корабля (формат x1,y1)");
        Ship singleDeck2 = new Ship() {};
        singleDeck2.addShip(battlefield, 1);
        shipsOfFleet.add(singleDeck2.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты третьего однопалубного корабля (формат x1,y1)");
        Ship singleDeck3 = new Ship() {};
        singleDeck3.addShip(battlefield, 1);
        shipsOfFleet.add(singleDeck3.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты последнего однопалубного корабля (формат x1,y1)");
        Ship singleDeck4 = new Ship() {};
        singleDeck4.addShip(battlefield, 1);
        shipsOfFleet.add(singleDeck4.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты первого двухпалубного корабля (формат x1,y1;x2,y2)");
        Ship doubleDeck1 = new Ship() {};
        doubleDeck1.addShip(battlefield, 2);
        shipsOfFleet.add(doubleDeck1.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты второго двухпалубного корабля (формат x1,y1;x2,y2)");
        Ship doubleDeck2 = new Ship() {};
        doubleDeck2.addShip(battlefield, 2);
        shipsOfFleet.add(doubleDeck2.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты последнего двухпалубного корабля (формат x1,y1;x2,y2)");
        Ship doubleDeck3 = new Ship() {};
        doubleDeck3.addShip(battlefield, 2);
        shipsOfFleet.add(doubleDeck3.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты первого трехпалубного корабля (формат x1,y1;x2,y2;x3,y3)");
        Ship tripleDeck1 = new Ship() {};
        tripleDeck1.addShip(battlefield, 3);
        shipsOfFleet.add(tripleDeck1.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты второго трехпалубного корабля (формат x1,y1;x2,y2;x3,y3)");
        Ship tripleDeck2 = new Ship() {};
        tripleDeck2.addShip(battlefield, 3);
        shipsOfFleet.add(tripleDeck2.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println("Введи координаты единственного четырехпалубного корабля (формат x1,y1;x2,y2;x3,y3;x4,y4)");
        Ship quadraDeck = new Ship() {};
        quadraDeck.addShip(battlefield, 4);
        shipsOfFleet.add(quadraDeck.getPointsOfShip());
        battlefield.printBattlefield();

        System.out.println(player.getName() + " построил все корабли.");
    }

    public boolean end(){
        return shipsOfFleet.isEmpty();
    }
}