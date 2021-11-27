package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileImport = new File("shoes.csv");
        File fileExport = new File("exportShoes");

        try {
            Scanner scanner = new Scanner(fileImport);
            PrintWriter pw = new PrintWriter(fileExport);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] good = line.split(";");
                if (Integer.parseInt(good[2]) == 0) {
                    pw.println(line);
                    System.out.println(line);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
