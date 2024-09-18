import delegates.Action;
import delegates.Func;
import login.Loginner;

import java.util.HashMap;
import java.util.Map;

public class CommandReader {
    private static final String NOT_COMMAND_CAUTION = "Такой команды нет!";

    private static final Map<String, Func> getCommands = new HashMap<>();
    private static final Map<String, Action> setCommands = new HashMap<>();

    static {
        getCommands.put("settings.get.language", Settings.getLanguage);
        getCommands.put("register", Loginner.onRegistration);

        setCommands.put("settings.set.language", Settings.setLanguage);
        setCommands.put("exit", Main.onExit);
    }

    public static void doCommand(String rawCommand) {

        Command command = new Command(rawCommand);

        if (setCommands.containsKey(command.getName())) {
            Action setCommand = setCommands.get(command.getName());
            System.out.println(setCommand.invoke(command.getParams()));
        } else if (getCommands.containsKey(command.getName())) {
            Func getCommand = getCommands.get(command.getName());
            System.out.println(getCommand.invoke());
        } else {
            System.out.println(NOT_COMMAND_CAUTION);
        }
    }
}
