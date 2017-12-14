import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.Files.readAllLines;


public class ListTasks {
    private Path filePath = Paths.get("../TodoList");
    private List<String> todoList = new ArrayList<>();

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public List<String> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<String> todoList) {
        this.todoList = todoList;
    }

    public void readFile() {
        try {
            List<String> lines = readAllLines(getFilePath());
            if (lines.size() < 1) {
                System.out.println("No todos for today! :)");
            } else {
                //todo lines should be costumized
                System.out.println(lines);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: " + getFilePath());
        }
    }
}
