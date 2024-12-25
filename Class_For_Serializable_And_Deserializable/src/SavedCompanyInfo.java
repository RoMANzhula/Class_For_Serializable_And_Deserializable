import java.io.Serializable;
import java.util.Arrays;

public class SavedCompanyInfo implements Serializable {
    private static final long serialVersionUID = 1L; // унікальний ідентифікатор версії серіалізованого класу,
    // який імплементує інтерфейс Serializable

    private String[] territoriesInfo; // приватне поле класу типу масив рядків, яке містить інформацію про
    // кількість і розташування філій компанії
    private String[] resourcesInfo; // приватне поле класу типу масив рядків, яке містить інформацію про
    // кількість фінансів по регіонах
    private String[] totalSummaInfo; // приватне поле класу типу масив рядків, яке містить інформацію про
    // загальну суму доходу

    public SavedCompanyInfo(String[] territoriesInfo, String[] resourcesInfo, String[] totalSummaInfo) { // конструктор класу
        this.territoriesInfo = territoriesInfo; // ініціалізація полів класу
        this.resourcesInfo = resourcesInfo;
        this.totalSummaInfo = totalSummaInfo;
    }

    public String[] getTerritoriesInfo() { // геттер
        return territoriesInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) { // сетер
        this.territoriesInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() { // геттер
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) { // сетер
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() { // геттер
        return totalSummaInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) { // сетер
        this.totalSummaInfo = diplomacyInfo;
    }

    @Override // анотація - переозначити
    public String toString() { // метод для перетворення в строковий вигляд
        return "SavedCompanyInfo{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomacyInfo=" + Arrays.toString(totalSummaInfo) +
                '}';
    }
}
