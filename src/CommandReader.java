import delegates.Action;
import delegates.Func;
import login.Loginner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class CommandReader {
    private static final String NO_SUCH_METHOD_OR_CLASS_EXCEPTION = "Такая команда не найдена";

    public Object doCommand(String rawCommand) {
    Command command = new Command(rawCommand);
    Method method;

        try {
            method = getMethod(command);

            boolean isMethodStatic = Modifier.isStatic(method.getModifiers());

            Object instance = isMethodStatic ? null : Class.forName(command.getClassName()).getDeclaredConstructor().newInstance();

            // Вызов метода с параметрами (или без, если их нет)
            if (command.getMethodParams() != null && command.getMethodParams().length > 0) {
               return method.invoke(instance, (Object[]) command.getMethodParams());
            } else {
               return method.invoke(instance);
            }
        } catch (NoSuchMethodException | ClassNotFoundException | IllegalAccessException | InvocationTargetException |
                 InstantiationException e) {
            System.out.println(NO_SUCH_METHOD_OR_CLASS_EXCEPTION);
        }
        return null;
    }

    private static Method getMethod(Command command) throws NoSuchMethodException, ClassNotFoundException {
       Method[] methods = Class.forName(command.getClassName()).getMethods();

        for (var curentMethod : methods){
            if(curentMethod.getName().equals(command.getMethodName())){
                return curentMethod;
            }
        }
        throw new NoSuchMethodException();
    }
}
