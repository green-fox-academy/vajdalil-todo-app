import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.*;

public class App {
    //todo agument -1

    private Path filePath = Paths.get("DataStored");
    Scanner userInput = new Scanner(System.in);
    List<String> todoList = new ArrayList<>();

    public void writeTodoList() {
        System.out.println("What to do?");
        String listElement = userInput.nextLine();
        todoList.add(listElement);
    }
    public void readFile() {
        try {
            List<String> lines = readAllLines(filePath);
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Unable to read file: " + filePath);
        }
    }

    public void writeFile() {
        try {
            Files.write(filePath,todoList);
        } catch(Exception e) {
            System.out.println("Unable to write file: " + filePath );
        }

    }
}
