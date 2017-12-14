import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.Files.readAllLines;


public class TaskFunctions {
    private Path filePath = Paths.get("../TodoList");
    private List<String> todoList = new ArrayList<>();

    public void readFile() {
        try {
            List<String> lines = readAllLines(filePath);
            if (lines.size() < 1) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println( i + 1 + " - " + lines.get(i).toString());
                }
            }
        }
        catch (IOException e) {
            System.out.println("Unable to read file: " + filePath);
        }
    }
    public void getInputToTaskToFile(String[] args) {
        for (int i = 1; i < args.length; i++) {
            todoList.add(String.valueOf(args[i]));
        }
        try {
            Files.write(filePath, todoList, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Unable to add: no task provided");
        }
    }
    public void removeTask(String [] args){
        int number = Integer.parseInt( args[1]);
        try {
            List<String> lines = readAllLines(filePath);
            if (lines.size() < 2) {
                System.out.println("Unable to remove: no index provided");
            } else if (lines.size() < number) {
                System.out.println("Unable to remove: index is out of bound");
            } else {
                lines.remove(number - 1);
            }
            Files.write(filePath,lines);
        }
        catch (IOException e ) {
            System.out.println("Unable to read file: " + filePath);
        }
    }
}
