public class Command {
    private final String name;
    private final String[] params;

    public Command(String rawCommand) {
        if (rawCommand.contains("-")) {
            name = rawCommand.split("-")[0];
            params = (rawCommand.split("-")[1]).split(", ");
        } else {
            name = rawCommand;
            params = null;
        }
    }

    public String[] getParams() {
        return params;
    }

    public String getName() {
        return name;
    }
}
