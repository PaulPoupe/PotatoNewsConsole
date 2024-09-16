import delegates.Action;
import delegates.Func;

public class Settings {
    public enum Languages {
        en,
        ru,
        by
    }

    private final static String SET_LANGUAGE_MESSAGE = "Язык успешно установлен - ";

    private static Languages language;

    static Func getLanguage = () -> getLanguage();
    static Action setLanguage = (String... dependens) -> setLanguage(dependens[0]);

    private static String setLanguage(String language) {
        Settings.language = Languages.valueOf(language);
        return SET_LANGUAGE_MESSAGE + Settings.language.toString();
    }

    public static String getLanguage() {
        return Settings.language.toString();
    }

}
