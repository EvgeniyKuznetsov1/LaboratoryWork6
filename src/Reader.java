import java.util.*;

public class Reader {
    private String name;            // Имя
    private String surname;         // Фамилия
    private String patronymic;      // Отчество
    private int ticketNumber;       // Номер читательского билета
    private String faculty;         // Факультет
    private String birthdayDate;    // Дата рождения
    private String phoneNumber;     // Номер телефона

    Reader(String name, String surname, String patronymic, int ticketNumber, String faculty, String birthdayDate, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int amountTakenBooks){
        System.out.printf("%s %s %s взял(-а) %d книг(-и)\n\n", surname, name,patronymic, amountTakenBooks);
    }

    public void takeBook(String... namesTakenBooks){
        System.out.printf("%s %s %s взял(-а) книги:\n", surname, name, patronymic);
        for(String book : namesTakenBooks)
            System.out.printf("%s\n", book);
        System.out.println();
    }

    public void returnBook(int amountReturnedBooks){
        System.out.printf("%s %s %s вернул(-а) %d книг(-и)\n\n", surname, name, patronymic, amountReturnedBooks);
    }

    public void returnBook(String... namesReturnedBooks){
        System.out.printf("%s %s %s вернул(-а) книги:\n", surname, name, patronymic);
        for(String book : namesReturnedBooks)
            System.out.printf("%s\n", book);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Иван", "Иванов", "Иванович", 2414, "Юридическое дело", "01/01/2006", "+79538492057"),
                new Reader("Мария", "Сидорова", "Олеговна", 2532, "Экономика", "02/05/2007", "+79538492867"),
                new Reader("Петр", "Петров", "Петрович", 4214, "Программирование", "01/08/2006", "+79535890275"),
                new Reader("Ольга", "Козлова", "Михайловна", 7542, "Бухгалтерское дело", "01/04/2005", "+79538592056"),
                new Reader("Алексей", "Никитин", "Сергеевич", 7384, "Юридическое дело", "30/08/2005", "+79535792534")
        };

        readers[0].takeBook(4);
        readers[0].returnBook(3);

        readers[3].takeBook("Время приключений", "Капитанская дочка", "1984");
        readers[3].returnBook("1984", "Время приключений");
    }
}


