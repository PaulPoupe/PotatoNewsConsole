import delegates.Action;
import delegates.Func;

import java.lang.reflect.Method;

public class Settings {
    public enum Languages {
        en,
        ru,
        by
    }

    private final static String SET_LANGUAGE_MESSAGE = "Язык успешно установлен - ";

    private static Languages language = Languages.en;

    public static String setLanguage(String[] language) {
        Settings.language = Languages.valueOf(language[0]);
        return SET_LANGUAGE_MESSAGE + Settings.language.toString();
    }

    public static String getLanguage() {
        return Settings.language.toString();
    }
    public void getTest(){
        System.out.println("Yes");
    }

}
