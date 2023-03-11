import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ClassForDeserializable implements Serializable {
    public void methodDeserializable() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\save.ser.txt"); //создаем поток для
        //чтения данных из файла

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); //создаем поток для десериализации обьекта

        SavedCompanyInfo savedCompanyInfo = (SavedCompanyInfo) objectInputStream.readObject(); //загружаем обьект

        System.out.println(savedCompanyInfo); //выводим на консоль сохраненную информацию
    }
}
