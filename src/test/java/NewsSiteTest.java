import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;

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
        mainPage.singIn();
        mainPage.dudesdey.shouldHave(text("DUDESDAY"));
    }


    @Test
    public void gettingUserInformation () {
        MainPage mainPage = new MainPage();
        userAuthorization();
        mainPage.userprofile();
        UserProfile userProfile = new UserProfile();
        userProfile.userName.shouldHave(value("Selenide"));
        userProfile.UserSurname.shouldHave(value("Selenium"));
        userProfile.UserEmail.shouldHave(value("Selenide3@Test.ru"));
    }

    @Test
    public void settingUserInformation() {
        MainPage mainPage = new MainPage();
        userAuthorization();
        mainPage.userprofile();
        UserProfile userProfile = new UserProfile();
        userProfile.userName.val("Selenide1");
        userProfile.UserSurname.val("Selenium1");
        userProfile.UserEmail.val("Selenide3@Test1.ru");

        userProfile.userName.shouldHave(value("Selenide1"));
        userProfile.UserSurname.shouldHave(value("Selenium1"));
        userProfile.UserEmail.shouldHave(value("Selenide3@Test1.ru"));

        userProfile.userName.val("Selenide");
        userProfile.UserSurname.val("Selenium");
        userProfile.UserEmail.val("Selenide3@Test.ru");


    }

    @Test
    public void CreateNewNews() {
        MainPage mainPage = new MainPage();
        userAuthorization();
        mainPage.userprofile();
        UserProfile userProfile = new UserProfile();
        userProfile.buttonClickAddNews();
        userProfile.addNews();
    }

    @Test
    public void getDheNews() {

    }


}
