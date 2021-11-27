package FinalProject.Ships;

import FinalProject.MarksOfCells;
import FinalProject.Game.Battlefield;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship {
    //Calling marks of cells
    MarksOfCells oreol = MarksOfCells.MARK_OREOL;
    MarksOfCells ship = MarksOfCells.MARK_SHIP;
    MarksOfCells empty = MarksOfCells.MARK_EMPTY;

    //variable//
    protected String name; //name of ship

    protected int sizeShip; //length of ship
    protected Point insertionPoint; //the point which user specifies
    protected List<Point> pointsOfShip = new ArrayList<>();

    public List<Point> getPointsOfShip() {
        return pointsOfShip;
    }

    public Ship(List<Point> points, Battlefield battlefield, int size) {
        this.sizeShip = size;
        this.insertionPoint = points.get(0);
        String[][] spaceOfShip = new String[3][sizeShip + 2];
        this.fillInSpaceOfShip(spaceOfShip);
        for (int i = 1; i < size + 1; i++) {
            spaceOfShip[1][i] = ship.getP();
        }
        if (points.size() == 1 || points.get(0).getI() == points.get(1).getI()) {
            this.setOfShip(points.get(0), battlefield, spaceOfShip);
        } else {
            this.rotateShip(points.get(0), battlefield, spaceOfShip);
        }
    }

    public Ship() {
    }

    protected List<Point> createInsertionPoint() {
        List<Point> points = new ArrayList<>();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] inputOfString = line.split(";");
                for (String x : inputOfString) {
                    String[] point1 = x.split(",");
                    points.add(new Point(Integer.parseInt(point1[0]), Integer.parseInt(point1[1])));
                }
                if (checkLine(points) == true) {
                    if (checkValidity(points) == true) {
                        break;
                    } else {
                        points.clear();
                        System.out.println("Корабль не создан. Точки должны располгаться последовательно (слева направо или сверху вниз");
                    }
                } else {
                    points.clear();
                    System.out.println("Корабль не создан. Точки должны располгаться на одной прямой");
                }

            } catch (NumberFormatException exception) {
                System.out.println("Неверный формат. Введите данные в формате i,j");
            }
        }
        pointsOfShip = points;
        return points;
    }

    protected void fillInSpaceOfShip(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = oreol.getP();
            }
        }
    }

    protected void setOfShip(Point point, Battlefield battlefield, String[][] strings) {
        for (int i = point.getI(); i < point.getI() + 3; i++) {
            for (int j = point.getJ(); j < point.getJ() + this.sizeShip + 2; j++) {
                battlefield.getBattlefield()[i][j] = strings[i - (point.getI())][j - point.getJ()];
            }
        }
    }

    protected void rotateShip(Point point, Battlefield battlefield, String[][] strings) {
        String[][] newArray = new String[strings[0].length][3];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                newArray[j][i] = strings[i][j];
            }
        }
        for (int i = point.getI(); i < point.getI() + this.sizeShip + 2; i++) {
            for (int j = point.getJ(); j < point.getJ() + 3; j++) {
                battlefield.getBattlefield()[i][j] = newArray[i - (point.getI())][j - point.getJ()];
            }
        }
    }

    public void addShip(Battlefield battlefield, int sizeShip) {

        while (true) {
            List<Point> points;
            try {
                while (true) {
                    points = this.createInsertionPoint();
                    if (points.size() == sizeShip) {
                        break;
                    } else {
                        points.clear();
                        System.out.println("Корабль не создан. Количество введеных точек должно соответсоввать коилчеству палуб корабля");
                    }
                }
                if (battlefield.getBattlefield()[points.get(0).getNewI()][points.get(0).getNewJ()] == empty.getP()) {
                    Ship ship1 = new Ship(points, battlefield, sizeShip);
                    System.out.println("Корабль успешно создан");
                    break;
                } else if (!checkNearShip(battlefield, points)) {
                    System.out.println("На этом месте уже есть корабль, введите другую точку");
                } else if (!checkNearOreol(battlefield, points)) {
                    System.out.println("Ваш корабль располагается слишком близко к существующему, введите другую точку");
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Неверный формат. Введите значение от 0 до 9");
            }
        }
    }

    private boolean checkLine(List<Point> points) {
        boolean isLine = false;
        for (int i = 1; i < points.size(); i++) {
            if (points.get(i).getI() == points.get(i - 1).getI() || points.get(i).getJ() == points.get(i - 1).getJ()) {
                isLine = true;
            }
        }
        if (points.size() == 1) {
            isLine = true;
        }
        return isLine;
    }

    private boolean checkValidity(List<Point> points) {
        boolean isValidity = false;
        for (int i = 1; i < points.size(); i++) {
            if (points.get(i).getI() - points.get(i - 1).getI() == 1 | points.get(i).getJ() - points.get(i - 1).getJ() == 1 && points.get(i).getI() > points.get(i - 1).getI() | points.get(i).getJ() > points.get(i - 1).getJ()) {
                isValidity = true;
            }
        }
        if (points.size() == 1) {
            isValidity = true;
        }
        return isValidity;
    }

    private boolean checkNearShip(Battlefield battlefield, List<Point> points) {
        boolean isNear = true;
        for (Point x : points) {
            if (battlefield.getBattlefield()[x.getNewI()][x.getNewJ()] == ship.getP()) {
                isNear = false;
            }
        }
        return  isNear;
    }

    private boolean checkNearOreol(Battlefield battlefield, List<Point> points) {
        boolean isNear = true;
        for (Point x : points) {
            if (battlefield.getBattlefield()[x.getNewI()][x.getNewJ()] == oreol.getP()) {
                isNear = false;
            }
        }
        return  isNear;
    }

}