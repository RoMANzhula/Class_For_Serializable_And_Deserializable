import java.io.*;

public class ClassForSerializable implements Serializable {
    public void methodSerializable() throws IOException {
        String[] territoryInfo = {"Київ має 6 фабрик.", "Львів має 4 фабрики.", "Одеса має 5 фабрик."};
        String[] moneyInfo = {"Київ має 6 мільйонів доларів.", "Львів має 4 мільйони доларів.", "Одеса має 5 мільйонів доларів."};
        String[] totalSummaInfo = {"Загальна сума грошей за два місяці становить 30 мільйонів доларів"};

        SavedCompanyInfo savedCompanyInfo = new SavedCompanyInfo(territoryInfo, moneyInfo, totalSummaInfo); // створюємо новий об'єкт
        // класу SavedCompanyInfo та заповнюємо конструктор аргументами

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\save.ser.txt"); // створюємо потік
        // для запису даних у вказаний файл

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // створюємо потік для серіалізації об'єкта

        objectOutputStream.writeObject(savedCompanyInfo); // зберігаємо інформацію про компанії у файл
        objectOutputStream.close(); // закриваємо потік та звільняємо ресурси
    }
}
