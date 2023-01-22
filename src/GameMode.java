import java.util.Random;

public class GameMode {
    public void withBot() {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getFirstNameSet());
        String firstPlayer = new UserInput().input();
        new Game().game(firstPlayer, "Бот", new Random().nextInt(1, 3), 250);
    }

    public void withFriend() {
        UInterfaceMess UI = new UInterfaceMess();
        System.out.println(UI.getFirstNameSet());
        String firstPlayer = new UserInput().input();
        System.out.println(UI.getSecondNameSet());
        String secondPlayer = new UserInput().input();
        new Game().game(firstPlayer, secondPlayer, new Random().nextInt(1, 3), 250);
    }
}
