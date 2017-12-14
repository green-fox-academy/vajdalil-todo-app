import java.nio.file.Files;

public class AddNewTasks extends  ListTasks{

    public void getInputToTaskList(String[] args) {
        for (int i = 1; i < args.length + 1; i++) {
            getTodoList().add(args[i]);
        }
    }
    public void writeFilefromTasks() {
        try {
            Files.write(getFilePath(), getTodoList());
        } catch (Exception e) {
            System.out.println("Unable to add: no task provided");
        }
    }
}
