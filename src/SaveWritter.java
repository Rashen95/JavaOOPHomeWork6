import java.io.FileWriter;
import java.io.IOException;

public class SaveWritter {
    public void write(String firstPlayer, String secondPlayer, int move, int numberOfCandies) {
        try (FileWriter writer = new FileWriter("save.txt", false)) {
            writer.append(String.format("%s %s %s %s", firstPlayer, secondPlayer, move, numberOfCandies));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
