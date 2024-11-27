import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class UserProfile {

    final SelenideElement userName = $x("//input[@placeholder=\"Имя\"]");
    final SelenideElement UserSurname = $x("//input[@placeholder=\"Фамилия\"]");
    final SelenideElement UserEmail = $x("//input[@placeholder=\"Почта\"]");
    final SelenideElement UserPassword = $x("//input[@placeholder=\"Пароль\"]");
    final SelenideElement UserProfileSubmit = $x("//button[@type=\"submit\"]");
    final SelenideElement buttonAddNews= $x("//button[contains(text(),'Добавить новость')]");

    final SelenideElement titleNews= $x("//input[@placeholder=\"Название\"]");
    final SelenideElement descriptionNews= $x("//input[@placeholder=\"Описание\"]");
    final SelenideElement tegNews= $x("//input[@placeholder=\"Теги\"]");
    final SelenideElement chooseFileNews= $x("/html/body/div[2]/div[3]/form/div[4]/div/input");
    final SelenideElement buttonToSendNews= $x("//button[contains(text(),'Отправить')]");




    public void buttonClickAddNews() {
        buttonAddNews.click();

    }

    public void addNews () {
        titleNews.val("Новая новость:)");
        descriptionNews.val("Бегимот на самолете");
        tegNews.val("Беги");
        File file = chooseFileNews.uploadFile(new File("src/main/resources/s.jpeg"));
        //chooseFileNews.setValue("/src/main/resources/suca.jpeg");
        buttonToSendNews.click();
        sleep(3000);

    }







}
