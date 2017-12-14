public class Main {

    public static void main(String[] args) {

        TaskFunctions todo = new TaskFunctions();


        //Print usage
        if (args.length == 0) {
            System.out.println("Command Line Todo application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    "-l   Lists all the tasks\n" +
                    "-a   Adds a new task\n" +
                    "-r   Removes an task\n" +
                    "-c   Completes an task");
            //this is working

        } else if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
            }

            //List all tasks
            if (args[0].equals("-l")) {
                todo.readFile();
                //empty list is working
            }


            //Adds a new task
            else if (args[0].equals("-a")) {
                todo.getInputToTaskList(args);
                todo.readFile();

            }


            //Removes a task
            else if (args[0].equals("-r")) {
            }


            //Completes a task
            else if (args[0].equals("-c")) {



            } else {
            }
        }
    }
}
