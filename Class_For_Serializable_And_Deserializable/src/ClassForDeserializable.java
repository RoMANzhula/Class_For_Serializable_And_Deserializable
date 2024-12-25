import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ClassForDeserializable implements Serializable {
    public void methodDeserializable() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\save.ser.txt"); // створюємо потік для
        // читання даних з файлу

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); // створюємо потік для десеріалізації об'єкта

        SavedCompanyInfo savedCompanyInfo = (SavedCompanyInfo) objectInputStream.readObject(); // завантажуємо об'єкт

        System.out.println(savedCompanyInfo); // виводимо на консоль збережену інформацію
    }
}
