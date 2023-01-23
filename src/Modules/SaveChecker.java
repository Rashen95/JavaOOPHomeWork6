package Modules;

import java.io.File;

public class SaveChecker {
    public boolean check() {
        return new File("save.txt").exists();
    }
}
