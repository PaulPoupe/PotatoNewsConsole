import delegates.Action;

import java.util.Scanner;

public class Main {

    private final static String END_PROGRAM_MESSAGE = "Программа завершила работу";

    private static boolean isOn = true;
    static Action onExit = (String... stringValue) -> exit();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            while (isOn) {
                System.out.print("Введите команду: ");
                CommandReader.doCommand(scanner.nextLine());
            }
        }
    }

    private static String exit() {
        isOn = false;
        return END_PROGRAM_MESSAGE;
    }
}