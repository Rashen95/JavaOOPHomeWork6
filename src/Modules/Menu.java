package Modules;

import java.io.FileNotFoundException;

public class Menu {
    public void startMenu() throws FileNotFoundException {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getGreetings());
        System.out.println(UI.getRegulations());
        new Menu().mainMenu();
    }

    public void mainMenu() throws FileNotFoundException {
        UInterfaceMess UI = new UInterfaceMess();
        boolean flag = false;
        if (new SaveChecker().check()) {
            while (!flag) {
                System.out.println(UI.getMainMenuWithSave());
                String change = new UserInput().input();
                switch (change) {
                    case "1" -> {
                        flag = true;
                        new GameMode().withBot();
                    }
                    case "2" -> {
                        flag = true;
                        new GameMode().withFriend();
                    }
                    case "3" -> {
                        flag = true;
                        new SaveReader().read();
                    }
                    case "4" -> {
                        flag = true;
                        System.out.println(UI.getExitGame());
                    }
                    default -> System.out.println(UI.getErrorItemMissing());
                }
            }
        } else {
            while (!flag) {
                System.out.println(UI.getMainMenuWithOutSave());
                String change = new UserInput().input();
                switch (change) {
                    case "1" -> {
                        flag = true;
                        new GameMode().withBot();
                    }
                    case "2" -> {
                        flag = true;
                        new GameMode().withFriend();
                    }
                    case "3" -> {
                        flag = true;
                        System.out.println(UI.getExitGame());
                    }
                    default -> System.out.println(UI.getErrorItemMissing());
                }
            }
        }
    }
}
