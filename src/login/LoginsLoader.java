package login;

import delegates.Func;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LoginsLoader {
    private final static int COUNT_OF_FILES = 0;

    public static void save(PersonLogin personLogin) throws IOException {

        var outputStream = new FileOutputStream(String.format("C:\\Users\\Pavel\\Desktop\\save%d.ser", COUNT_OF_FILES));
        var objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(personLogin);
        objectOutputStream.close();
    }

    /*
    private static boolean availability(PersonLogin personLogin){
    }

    private static void rewriteSave(PersonLogin personLogin){
    }

    private static  void saveAsNew(PersonLogin personLogin){
    }

    private static PersonLogin getLoginFromDataBase(PersonLogin personLogin){
    }
     */
}
