package Modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaveReader {
    public void read() throws FileNotFoundException {
        Scanner s = new Scanner(new File("save.txt"));
        while (s.hasNext()) {
            String save = s.nextLine();
            String[] saveList = save.split(" ");
            new Game().game(saveList[0], saveList[1], Integer.parseInt(saveList[2]), Integer.parseInt(saveList[3]));
        }
    }
}
