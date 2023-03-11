import java.io.Serializable;
import java.util.Arrays;

public class SavedCompanyInfo implements Serializable {
    private static final long serialVersionUID = 1L; //уникальный идентификатор версии сериализованного класса,
    //который имплементирует интерфейс Serializable

    private String[] territoriesInfo; //приватное поле класса типа массив строк, кот.содержит инфо об
    // количистве и расположении филиалов компании
    private String[] resourcesInfo; //приватное поле класса типа массив строк, кот.содержит инфо об
    // количистве финансов по регионам
    private String[] totalSummaInfo; //приватное поле класса типа массив строк, кот.содержит инфо об
    // общей сумме дохода

    public SavedCompanyInfo(String[] territoriesInfo, String[] resourcesInfo, String[] totalSummaInfo) { //конструктор класса
        this.territoriesInfo = territoriesInfo; //инициализация полей класса
        this.resourcesInfo = resourcesInfo;
        this.totalSummaInfo = totalSummaInfo;
    }

    public String[] getTerritoriesInfo() { //геттер
        return territoriesInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) { //сеттер
        this.territoriesInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() { //геттер
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) { //сеттер
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() { //геттер
        return totalSummaInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) { //сеттер
        this.totalSummaInfo = diplomacyInfo;
    }

    @Override //аннатация - переопределить
    public String toString() { //метод к строковому виду
        return "SavedCompanyInfo{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(totalSummaInfo) +
                '}';
    }
}