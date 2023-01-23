package Modules;

public class UInterfaceMess {
    private static final String greetings = "\nВы запустили игру в конфетки";
    private static final String regulations = "Перед вами лежит 200 конфет. За один ход можно брать от 1 до 27 конфет. Побеждает тот, кто возьмет последние конфеты";
    private static final String errorDigit = "\nВы ввели не число";
    private static final String errorSweetsNumber = "\nВы ввели неверное количество\nМожно взять от 1 до 27 конфет";
    private static final String errorRemainingSweets = "\nВы хотите взять больше конфет чем осталось";
    private static final String mainMenuWithSave = "\n1. Играть с ботом\n2. Играть с другом\n3. Загрузить прошлую игру\n4. Выйти из игры";
    private static final String mainMenuWithOutSave = "\n1. Играть с ботом\n2. Играть с другом\n3. Выйти из игры";
    private static final String errorItemMissing = "\nНет такого пункта меню";
    private static final String firstNameSet = "\nВведите имя первого игрока";
    private static final String secondNameSet = "\nВведите имя второго игрока";
    private static final String exitGame = "\nЗавершаю работу игры";

    public String getGreetings() {
        return greetings;
    }

    public String getRegulations() {
        return regulations;
    }

    public String getErrorDigit() {
        return errorDigit;
    }

    public String getErrorSweetsNumber() {
        return errorSweetsNumber;
    }

    public String getErrorRemainingSweets() {
        return errorRemainingSweets;
    }

    public String getMainMenuWithSave() {
        return mainMenuWithSave;
    }

    public String getMainMenuWithOutSave() {
        return mainMenuWithOutSave;
    }

    public String getErrorItemMissing() {
        return errorItemMissing;
    }

    public String getFirstNameSet() {
        return firstNameSet;
    }

    public String getSecondNameSet() {
        return secondNameSet;
    }

    public String getExitGame() {
        return exitGame;
    }

    public String playerTurn(String playerName) {
        return String.format("\n%s, ход за вами", playerName);
    }

    public String getSelectionOfSweets(int numberOfCandies) {
        return String.format("Осталось %s конфет. Сколько возьмете?", numberOfCandies);
    }

    public String playerWin(String playerName) {
        return String.format("\n%s стал победителем", playerName);
    }

    public String botTurn(int subtrahend) {
        return String.format("\nБот взял %s конфет", subtrahend);
    }
}