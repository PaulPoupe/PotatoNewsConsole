public class Command {
    private final String className;
    private final String methodName;
    private final String[] methodParams;
    private final boolean haveParams;

    public Command(String rawCommand) {
        haveParams = rawCommand.contains("-");
        className = rawCommand.substring(0 ,rawCommand.lastIndexOf('.'));

        if (haveParams) {
            methodName = rawCommand.substring(rawCommand.lastIndexOf('.') + 1, rawCommand.indexOf('-'));
            methodParams = rawCommand.split("-")[1].split(", ");
        } else {
            methodName = rawCommand.substring(rawCommand.lastIndexOf('.') + 1);
            methodParams = new String[0];
        }
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName(){
        return methodName;
    }

    public String[] getMethodParams(){
        if (haveParams) {
            return methodParams;
        }
        return null;
    }
}
