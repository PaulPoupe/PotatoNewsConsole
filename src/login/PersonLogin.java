package login;

import java.io.Serializable;

public class PersonLogin implements Serializable {

    private final String login;
    private final int hashPassword;

    public PersonLogin(String login, String password) {
        this.login = login;
        this.hashPassword = password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PersonLogin inLogin) {

            if (!this.login.equals(inLogin.login)) {
                return false;
            }

            return this.hashPassword == inLogin.hashPassword;
        }
        return false;
    }

    public String getLogin() {
        return login;
    }
}


