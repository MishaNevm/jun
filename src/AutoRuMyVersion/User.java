package AutoRuMyVersion;

import java.io.Serial;
import java.io.Serializable;

public class User extends DailyCar implements Serializable {
    @Serial
    private static final long serialVersionUID = -8619089396423905586L;

    // создать Линкед лист объектов класса авто и всех кто от него наследуется. И закидывать все эти объекты в файл
    // в дирректории с Именем и номером телефона юзера
    public User(String brand, String model) {
        super(brand, model);
    }
}
