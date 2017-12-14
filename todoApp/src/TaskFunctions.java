import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import static java.nio.file.Files.readAllLines;


public class TaskFunctions extends Task {


    public void readFile() {
        try {
            List<String> lines = readAllLines(getFilePath());
            if (lines.size() < 1) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println( i + 1 + " - " + lines.get(i).toString());
                }
            }
        }
        catch (IOException e) {
            System.out.println("Unable to read file: " + getFilePath());
        }
    }
    public void getInputToTaskToFile(String[] args) {
        for (int i = 1; i < args.length; i++) {
            getTodoList().add(String.valueOf(args[i]));
        }
        try {
            Files.write(getFilePath(), getTodoList(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Unable to add: no task provided");
        }
    }
}
