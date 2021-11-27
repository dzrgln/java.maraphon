package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?«»!\"\\s–]+");
            List<String> listOfWords = new ArrayList<>();
            int counter = 0;
            Map<String, Integer> words = new HashMap<>();
            while (scanner.hasNextLine()) {
                listOfWords.add(scanner.next());
            }
            for (int i = 0; i < listOfWords.size(); i++) {
                if (words.containsKey(listOfWords.get(i))) {
                    words.put(listOfWords.get(i), counter = counter + 1);
                } else {
                    words.put(listOfWords.get(i), counter = 1);
                }
            }
            List sortedWords = new ArrayList(words.entrySet());

            List<Map.Entry<Integer, String>> valuesList = new ArrayList(words.entrySet());
            Comparator<Map.Entry> comparatorWords = new CompareWords();
            Collections.sort(valuesList, comparatorWords);
            for (int i = valuesList.size() - 1; i > valuesList.size() - 101; i--) {
                System.out.print(valuesList.size() - i + ". ");
                System.out.println(valuesList.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

class CompareWords implements Comparator<Map.Entry> {

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return (int) o1.getValue() - (int) o2.getValue();
    }
}