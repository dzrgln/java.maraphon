package day12.task4;



import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return name + " " + year;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (int i = 0; i < b.getMembers().size(); i++) {
            a.getMembers().add(b.getMembers().get(i));
        }
        b.getMembers().removeAll(b.getMembers());
    }

    public void addMembers(String x) {
        members.add(x);
    }

    public void printMembers() {
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }
}
