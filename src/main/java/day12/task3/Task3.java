package day12.task3;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("AaA", 1995));
        bands.add(new MusicBand("BbB", 1996));
        bands.add(new MusicBand("CcC", 1999));
        bands.add(new MusicBand("DdD", 1998));
        bands.add(new MusicBand("EeE", 1999));
        bands.add(new MusicBand("FfF", 2000));
        bands.add(new MusicBand("GgG", 2001));
        bands.add(new MusicBand("HhH", 2002));
        bands.add(new MusicBand("JjJ", 2003));
        bands.add(new MusicBand("KkK", 2004));
        System.out.println(bands);

        Collections.shuffle(bands);
        System.out.println();
        System.out.println(bands);
        groupsAfter2000(bands);
        System.out.println(groupsAfter2000(bands));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() >= 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }
}
