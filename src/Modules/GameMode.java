package Modules;

import java.util.Random;

public class GameMode {
    public void withBot() {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getFirstNameSet());
        String firstPlayer = new UserInput().input();
        int move = new Random().nextInt(1, 3);
        new SaveWritter().write(firstPlayer, "Бот", move, 200);
        new Game().game(firstPlayer, "Бот", move, 200);
    }

    public void withFriend() {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getFirstNameSet());
        String firstPlayer = new UserInput().input();
        System.out.println(UI.getSecondNameSet());
        String secondPlayer = new UserInput().input();
        int move = new Random().nextInt(1, 3);
        new SaveWritter().write(firstPlayer, secondPlayer, move, 200);
        new Game().game(firstPlayer, secondPlayer, move, 200);
    }
}
