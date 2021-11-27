package FinalProject.Game;

import FinalProject.MarksOfCells;
import FinalProject.Ships.Fleet;
import FinalProject.Ships.Point;

import java.util.List;
import java.util.Scanner;

public class Player {
    //Calling marks of cells
    MarksOfCells empty = MarksOfCells.MARK_EMPTY;
    MarksOfCells ship = MarksOfCells.MARK_SHIP;
    MarksOfCells shot = MarksOfCells.MARK_SHOT;
    MarksOfCells oreol = MarksOfCells.MARK_OREOL;
    MarksOfCells kill = MarksOfCells.MARK_KILL;

    private static int numberOfPlayer = 1;
    private String name;

    public String getName() {
        return name;
    }

    public Player(Battlefield battlefield) {
        this.name = "Игрок " + numberOfPlayer;
        numberOfPlayer = numberOfPlayer + 1;
    }

    public void shot(Battlefield battlefield, Fleet fleet) {
        System.out.println("Ходит " + this.name);
        while (true) {
            System.out.println("Введите координаты поля для выстрела в формате i,j");
            Point point = userPoint();
            if (battlefield.getBattlefield()[point.getNewI()][point.getNewJ()] == empty.getP() || battlefield.getBattlefield()[point.getNewI()][point.getNewJ()] == oreol.getP()) {
                battlefield.getBattlefield()[point.getNewI()][point.getNewJ()] = shot.getP();
                System.out.println("Выстрел по полю с координатами: " + point.getNewI() + ", " + point.getNewJ() + "\nМимо :(");
                break;
            } else if (battlefield.getBattlefield()[point.getNewI()][point.getNewJ()] == ship.getP()) {
                battlefield.getBattlefield()[point.getNewI()][point.getNewJ()] = kill.getP();
                checkHit(point, fleet);
                if (fleet.end() == true) {
                    System.out.println("⭐⭐⭐ Ты победил, " + this.name + "! ⭐⭐⭐");
                    break;
                } else {
                    System.out.println("Ходи еще раз :)");
                }
            } else {
                System.out.println("Данная область была поражена ранее. Повторите выстрел.");
            }
        }
    }

    private Point userPoint() {
        int a = 0;
        int b = 0;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] inputOfString = line.split(",");
                a = Integer.parseInt(inputOfString[0]);
                b = Integer.parseInt(inputOfString[1]);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат. Введите данные в формате i,j");
            }
        }
        Point point = new Point(a, b);
        return point;
    }

    private void checkHit(Point point, Fleet fleet) {
        for (List<Point> x : fleet.getShipsOfFleet()) {
            for (Point y : x) {
                if (y.equals(point)) {
                    x.remove(y);
                    if (!x.isEmpty()) {
                        System.out.println("Попал :)");
                    } else {
                        System.out.println("Убил ^)");
                    }
                }
                break;
            }
            if (x.isEmpty()) {
                fleet.getShipsOfFleet().remove(x);
            }
            break;
        }
    }
}