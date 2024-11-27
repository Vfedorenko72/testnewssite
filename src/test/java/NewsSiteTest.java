import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class NewsSiteTest extends BaseTest {


    @Test
    public void userRegistration() {
        MainPage mainPage = new MainPage();
        mainPage.singUp();
        mainPage.dudesdey.shouldHave(text("DUDESDAY"));
    }

    @Test
    public void userAuthorization() {
        MainPage mainPage = new MainPage();
        mainPage.singUp();
        mainPage.dudesdey.shouldHave(text("DUDESDAY"));
    }



}
