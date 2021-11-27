package FinalProject.Ships;

import java.util.Objects;

public class Point {
    private int i;
    private int j;

    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {return i;}
    public int getJ() {return j;}

    public int getNewI() {return i+1;}
    public int getNewJ() {return j+1;}

    @Override
    public String toString() {
        return "Point{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return i == point.i && j == point.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }
}
