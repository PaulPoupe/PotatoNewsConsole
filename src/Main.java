import delegates.Action;

import java.util.Scanner;

public class Main {

    private final static String END_PROGRAM_MESSAGE = "Программа завершила работу";
    static Action onExit = (String... stringValue) -> exit();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            CommandReader.doCommand(scanner.nextLine());
        }
    }

    private static String exit() {
        System.exit(0);
        return END_PROGRAM_MESSAGE;
    }
}