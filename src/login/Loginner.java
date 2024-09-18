package login;

import delegates.Func;

import java.io.IOException;

public class Loginner {
    public static Func onRegistration;

    static {
        PersonLogin pavel = new PersonLogin ("pavel.p1112@gmail.com", "291949683Abp");

        onRegistration = () -> {
            try {
                return registration(pavel);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }



    private static String registration(PersonLogin personLogin) throws IOException {
        LoginsLoader.save(personLogin);
        return "зарегался успешно";
    }
}
