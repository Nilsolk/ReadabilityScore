package readability;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        String text = importText(args[0]);
        TryToRead tryToRead = new TryToRead();
        tryToRead.reading(text);

    }

    private static String importText(String imText) {
        File file = new File(imText);
        String text = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                text = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return text;
    }
}
