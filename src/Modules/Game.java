package Modules;

import java.io.File;

public class Game {
    public void game(String firstPlayer, String secondPlayer, int move, int numberOfCandies) {
        UInterfaceMess UI = new UInterfaceMess();
        while (numberOfCandies > 0) {
            if (move == 1) {
                System.out.println(UI.playerTurn(firstPlayer));
                numberOfCandies = new SelectionOfSweets().sel(numberOfCandies);
                move = 2;
                new SaveWritter().write(firstPlayer, secondPlayer, move, numberOfCandies);
            } else {
                if (!secondPlayer.equals("Бот")) {
                    System.out.println(UI.playerTurn(secondPlayer));
                    numberOfCandies = new SelectionOfSweets().sel(numberOfCandies);
                } else {
                    numberOfCandies = new Bot().selectionOfSweets(numberOfCandies);
                }
                move = 1;
                new SaveWritter().write(firstPlayer, secondPlayer, move, numberOfCandies);
            }
        }
        if (move == 1) {
            System.out.println(UI.playerWin(secondPlayer));
        } else {
            System.out.println(UI.playerWin(firstPlayer));
        }
        boolean result = new File("save.txt").delete();
    }
}
