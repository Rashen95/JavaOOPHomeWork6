package Modules;

public class Bot {
    public int selectionOfSweets(int numberOfCandies) {
        UInterfaceMess UI = new UInterfaceMess();
        if (numberOfCandies > 28 && numberOfCandies % 29 > 0) {
            int subtrahend = numberOfCandies % 29;
            numberOfCandies -= subtrahend;
            System.out.println(UI.botTurn(subtrahend));
        } else if (numberOfCandies > 28) {
            numberOfCandies--;
            System.out.println(UI.botTurn(1));
        } else {
            System.out.println(UI.botTurn(numberOfCandies));
            numberOfCandies -= numberOfCandies;
        }
        return numberOfCandies;
    }
}
