import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    final SelenideElement singInElement = $x("//button[(1)]");
    final SelenideElement signUpElement = $x("//button[(2)]");
    final SelenideElement clearUrlToBeckElement = $x("//button[(3)]");

    final SelenideElement emailIn = $x("//input[@placeholder = 'Почта']");
    final SelenideElement passwordIn = $x("//input[@placeholder = 'Пароль'");

    final SelenideElement emailUp = $x("//input[@placeholder = 'Почта']");
    final SelenideElement passwordUp = $x("//input[@placeholder = 'Пароль']");

    final SelenideElement submit = $x("//button[@type=\"submit\"]");
    final SelenideElement dudesdey = $x("//a[@href=\"/posts\"]");


    final String login = "Selenide3@Test.ru";
    final String password = "Test3Selenide";



    public void singUp() {
        singInElement.click();
        emailUp.setValue(login);
        passwordUp.setValue(password);
        submit.click();


    }

    public void singIn() {
        singInElement.click();
        emailUp.setValue(login);
        passwordUp.setValue(password);
        submit.click();


    }
}
