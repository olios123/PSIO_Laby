package PSIO12.zad2;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = scanner.nextLine();

        analyzeFile(path);
    }

    private static void analyzeFile(String path) {
        File file = new File("./src/" + path);
        ArrayList<String> words = new ArrayList<String>();
        Map<String, Integer> wordsCounter = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            for (String line : bufferedReader.lines().toList()) {
                words.addAll(Arrays.asList(line.split("\\s+")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String word : words) {
            wordsCounter.put(word, wordsCounter.getOrDefault(word, 0) + 1);
        }

        System.out.println("Words: " + words.size());
        System.out.println("Unique words: " + wordsCounter.size());

        Map<String, Integer> keysMap =
                wordsCounter.entrySet()
                        .stream()
                        .sorted(
                                Map.Entry.<String, Integer>comparingByKey()
                                        .thenComparing(Map.Entry.<String, Integer>comparingByValue().reversed())
                        )
                        .collect(
                                LinkedHashMap::new,
                                (m, e) -> m.put(e.getKey(), e.getValue()),
                                LinkedHashMap::putAll
                        );

        System.out.println("Sort alphabetically:");
        for (Map.Entry<String, Integer> entry : keysMap.entrySet()) {
            System.out.printf("%-12s", entry.getKey());
            System.out.printf("%6s\n", entry.getValue());
        }

        Map<String, Integer> valuesMap =
                wordsCounter.entrySet()
                        .stream()
                        .sorted(
                                Map.Entry.<String, Integer>comparingByValue()
                                        .thenComparing(Map.Entry.<String, Integer>comparingByValue().reversed())
                        )
                        .collect(
                                LinkedHashMap::new,
                                (m, e) -> m.put(e.getKey(), e.getValue()),
                                LinkedHashMap::putAll
                        );

        System.out.println("\nSort by values:");
        for (Map.Entry<String, Integer> entry : valuesMap.entrySet()) {
            System.out.printf("%-12s", entry.getKey());
            System.out.printf("%6s\n", entry.getValue());
        }


    }

}
