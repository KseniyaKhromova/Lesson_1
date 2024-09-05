import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {

       Person person = new Person(
               "Khromova Kseniya Sergeevna",
               "director",
               "Khromova@yandex.ru",
               "+7(904)-234-21-32",
               1328726,
               26
       );
       person.printEmployee();
       Person[] personArray = new Person[5];
       personArray[0] = new Person("Khromova Kseniya Sergeevna","director","Khromova@yandex.ru",
               "+7(904)-234-21-32",1328726,26);
        personArray[1] = new Person("Khromova Dasha Sergeevna","teacher","Dasha@yandex.ru",
                "+7(904)-224-43-34",122424,27);
        personArray[2] = new Person("Khromova Masha Sergeevna","doctor","Masha@yandex.ru",
                "+7(904)-234-67-35",24123,28);
        personArray[3] = new Person("Khromova Sasha Sergeevna","waiter","Sasha@yandex.ru",
                "+7(904)-264-78-52",23211616,22);
        personArray[4] = new Person("Khromova Ira Sergeevna","courier","Ira@yandex.ru",
                "+7(904)-204-00-30",234235,25);

        Park.Attraction ferrisWheel = new Park.Attraction("ferris wheel", "09:00 - 18:00", 500);

    }
}
