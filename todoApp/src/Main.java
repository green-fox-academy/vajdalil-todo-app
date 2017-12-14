public class Main {

public static void main(String[] args) {

    ListTasks todoList = new ListTasks();

    //this is working
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
            System.out.println("Here should be a function that adds " + args[0] + " todo to your list.");
            //empty list is working
            todoList.readFile();
        }

        }else if (args[0].equals("-r")) {

        }else if (args[0].equals("-c")) {

        }
    }
 }
