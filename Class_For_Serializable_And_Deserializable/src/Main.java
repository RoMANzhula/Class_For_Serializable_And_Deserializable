import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassForSerializable classForSerializable = new ClassForSerializable(); //создаем новый обьект класса КлассДляСериализации
        classForSerializable.methodSerializable(); //вызываем методСериализации для ссыл.переменной на обьект

        ClassForDeserializable classForDeserializable = new ClassForDeserializable();//создаем новый обьект класса КлассДляДесериализации
        classForDeserializable.methodDeserializable();//вызываем методСериализации для ссыл.переменной на обьект
    }
}