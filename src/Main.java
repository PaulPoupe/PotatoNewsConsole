import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandReader commandReader = new CommandReader();

        while (true){
            System.out.println(commandReader.doCommand(scanner.nextLine()));
        }
    }


}