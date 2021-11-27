package day12.task5;


public class Task5 {
    public static void main(String[] args) {
        MusicBand queen = new MusicBand("Queen", 1980);
        queen.addMembers(new MusicArtist("Freddy", 40));
        queen.addMembers(new MusicArtist("Pol", 35));
        queen.printMembers();

        MusicBand aria = new MusicBand("Ария", 1985);
        aria.addMembers(new MusicArtist("Холстинин", 30));
        aria.addMembers(new MusicArtist("Дубинин", 40));
        aria.printMembers();
        System.out.println();

        MusicBand.transferMembers(aria, queen);
        queen.printMembers();
        aria.printMembers();
    }
}
