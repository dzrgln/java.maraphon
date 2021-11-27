package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand queen = new MusicBand("a", 1980);
        queen.addMembers("Freddy");
        queen.addMembers("Pol");
        queen.printMembers();

        MusicBand aria = new MusicBand("Aрия", 1985);
        aria.addMembers("Холстинин");
        aria.addMembers("Дубинин");
        aria.printMembers();

        MusicBand.transferMembers(aria, queen);
        queen.printMembers();
        aria.printMembers();
    }
}
