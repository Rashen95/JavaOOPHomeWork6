package Modules;

public class SelectionOfSweets {
    public int sel(int numberOfCandies) {
        UInterfaceMess UI = new UInterfaceMess();
        boolean flag = false;
        while (!flag) {
            System.out.println(UI.getSelectionOfSweets(numberOfCandies));
            String number = new UserInput().input();
            if (new Checker().isDigit(number)) {
                int numberInt = Integer.parseInt(number);
                if (numberInt > 0 && numberInt < 29) {
                    if (numberInt <= numberOfCandies) {
                        flag = true;
                        numberOfCandies = numberOfCandies - numberInt;
                    } else {
                        System.out.println(UI.getErrorRemainingSweets());
                    }
                } else {
                    System.out.println(UI.getErrorSweetsNumber());
                }
            } else {
                System.out.println(UI.getErrorDigit());
            }
        }
        return numberOfCandies;
    }
}
