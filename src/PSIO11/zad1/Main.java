package PSIO11.zad1;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Input new file path: ");
        String copyFilePath = scanner.nextLine();
        System.out.print("Char to count: ");
        String charToCount = scanner.nextLine();

        System.out.println("--------------------");

        analyzeFileBuffered(filePath, copyFilePath, charToCount);
        System.out.println("--------------------");
        analyzeFileScanner(filePath, copyFilePath, charToCount);
    }

    private static void analyzeFileBuffered(String path, String destination, String selectedChar) {
        File file = new File("./src/" + path);
        File destinationFile = new File("./src/buffered-" + destination);

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            destinationFile.createNewFile();

            int chars = 0;
            int whiteChars = 0;
            int words = 0;
            int specifiedChars = 0;

            for (String line : reader.lines().toList()) {
                String[] split = line.split("\\s+");

                whiteChars += line.length() - line.replaceAll("\\s+", "").length();

                for (String word : split) {
                    String[] charSplit = word.split("");
                    chars += charSplit.length;
                    for (String ch : charSplit) {
                        if (Objects.equals(ch, selectedChar)) {
                            specifiedChars++;
                        }
                    }
                }

                writer.write(line);
                writer.newLine();

                words += split.length;
            }

            reader.close();
            writer.close();

            System.out.println("Chars: " + chars);
            System.out.println("Words: " + words);
            System.out.println("Specified char (" + selectedChar + "): " + specifiedChars);
            System.out.println("Black chars: " + (chars - whiteChars));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void analyzeFileScanner(String path, String destination, String selectedChar) {
        File file = new File("./src/" + path);
        File destinationFile = new File("./src/scanner-" + destination);

        try (Scanner scanner = new Scanner(file);
             PrintWriter writer = new PrintWriter(new FileWriter(destinationFile))) {
            destinationFile.createNewFile();

            int chars = 0;
            int whiteChars = 0;
            int words = 0;
            int specifiedChars = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("\\s+");

                whiteChars += line.length() - line.replaceAll("\\s+", "").length();

                for (String word : split) {
                    String[] charSplit = word.split("");
                    chars += charSplit.length;
                    for (String ch : charSplit) {
                        if (Objects.equals(ch, selectedChar)) {
                            specifiedChars++;
                        }
                    }
                }

                writer.println(line);

                words += split.length;
            }

            writer.close();
            scanner.close();

            System.out.println("Chars: " + chars);
            System.out.println("Words: " + words);
            System.out.println("Specified char (" + selectedChar + "): " + specifiedChars);
            System.out.println("Black chars: " + (chars - whiteChars));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
