public class Menu {
    public void startMenu() {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getGreetings());
        new Menu().mainMenu();
    }

    public void mainMenu() {
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
                        System.out.println("ГРУЖУ");
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
