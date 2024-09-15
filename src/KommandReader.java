import java.util.HashMap;
import java.util.Map;

public class KommandReader {
    private static final String notCommandCaution = "Такой команды нет!";

    private static final Map<String, Runnable> commands = new HashMap<>();

    private static void main(String[] args) {
        CommandsPutting();
    }

    private static void CommandsPutting(){

    }

    public static void CompleteCommand(String command){
        if(!commands.containsKey(command))
            System.out.println(notCommandCaution);

        commands.get(command).run();
    }

}
