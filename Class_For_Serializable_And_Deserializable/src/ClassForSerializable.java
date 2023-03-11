import java.io.*;

public class ClassForSerializable implements Serializable {
    public void methodSerializable() throws IOException {
        String[] territoryInfo = {"Kiev has 6 fabrics.", "Lvov has 4 fabrics.", "Odessa has 5 fabrics."};
        String[] moneyInfo = {"Kiev has 6 million dollars.", "Lvov has 4 million dollars.", "Odessa has 5 million dollars."};
        String[] totalSummaInfo = {"Total summa money from two month is 30 million dollars"};

        SavedCompanyInfo savedCompanyInfo = new SavedCompanyInfo(territoryInfo, moneyInfo, totalSummaInfo);//создаем новый обьект
        //класса СохраненнаяИнформацияКомпании и заполняем конструктор аргументами

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\save.ser.txt"); //создаем поток
        //для записи данных в указанный файл

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); //создаем поток для сериализации обьекта

        objectOutputStream.writeObject(savedCompanyInfo); //сохраняем информацию про компании в файл
        objectOutputStream.close(); //закрываем поток и освобождаем ресурсы


    }
}