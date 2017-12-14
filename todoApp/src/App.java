import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.*;

public class App {

    public readFile() {
        Paths filePath = Paths.get("DataStore");
        try {
            List<String> lines = readAllLines (filePath);
            System.out.println(lines);
        } catch(Exception e) {
            System.out.println("Can not read file");
        }
    }
}
