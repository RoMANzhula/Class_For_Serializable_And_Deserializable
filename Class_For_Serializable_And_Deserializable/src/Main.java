import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassForSerializable classForSerializable = new ClassForSerializable(); // створюємо новий об'єкт класу ClassForSerializable
        classForSerializable.methodSerializable(); // викликаємо метод методSerializable для змінної-лінка на об'єкт

        ClassForDeserializable classForDeserializable = new ClassForDeserializable(); // створюємо новий об'єкт класу ClassForDeserializable
        classForDeserializable.methodDeserializable(); // викликаємо метод методDeserializable для змінної-лінка на об'єкт
    }
}
