package PSIO11.zad2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Input new file path: ");
        String newFilePath = scanner.nextLine();

        byteCopy(filePath, newFilePath);
        ownBuffer(filePath, newFilePath);
        systemBuffer(filePath, newFilePath);
    }

    public static void byteCopy(String source, String destination) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        long start = System.nanoTime();

        try {
            inputStream = new FileInputStream("./src/" + source);
            outputStream = new FileOutputStream("./src/byte-" + destination);

            int b;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        System.out.println("Binary copy time: " + (end - start) / 1000000 + "ms");
    }

    public static void ownBuffer(String source, String destination) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        long start = System.nanoTime();

        try {
            inputStream = new FileInputStream("./src/" + source);
            outputStream = new FileOutputStream("./src/own-" + destination);

            byte[] buffer = new byte[4096]; // 4KB
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        System.out.println("Own buffer time: " + (end - start) / 1000000 + "ms");
    }

    public static void systemBuffer(String source, String destination) {
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        long start = System.nanoTime();

        try {
            inputStream = new BufferedInputStream(new FileInputStream("./src/" + source));
            outputStream = new BufferedOutputStream(new FileOutputStream("./src/system-" + destination));

            int b;
            while ((b = inputStream.read()) != -1) {
                outputStream.write(b);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();
        System.out.println("System buffer time: " + (end - start) / 1000000 + "ms");
    }
}
