import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {

    ListTasks todoThis = new ListTasks();

    if (args.length == 0) {
        System.out.println("Command Line Todo application\n" +
                        "=============================\n" +
                        "\n" +
                        "Command line arguments:\n" +
                        "-l   Lists all the tasks\n" +
                        "-a   Adds a new task\n" +
                        "-r   Removes an task\n" +
                        "-c   Completes an task");
    }
    else if (args.length > 0) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);

        }
        if (args[0].equals("-l")) {

        }else if (args[0].equals("-a")) {
            System.out.println("Here should be a function that adds " + args[1] + " todo to your list.");
        }

        }else if (args[0].equals("-r")) {

        }else if (args[0].equals("-c")) {

        }
    }
 }
