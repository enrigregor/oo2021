import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilterFile {
    public static void main(String[] args) throws IOException {
        //loon uue faili
        PrintWriter writeFile = new PrintWriter(new FileWriter("trainiees_completed.txt"));

        //loen olemas olevat faili
        Files.readAllLines(Paths.get("traniees.txt"))
            .stream()
            .map(e -> e.split(","))
            .filter(e -> Integer.parseInt(e[1]) >= 3)
            .map(e -> "Name: " + e[0] + "| Number of errors fixed: " + e[2] + "| Added workspace points: " + e[1])
            .forEach(e -> writeFile.println(e));
            writeFile.close();
    }
}
