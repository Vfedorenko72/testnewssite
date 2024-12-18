import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

abstract class BaseTest {
    private final static String BECK_URL = "https://api.news.academy.dunice.net/";
    private final static String APP_URL = "https://news.academy.dunice.net/start";

    public static void setUp() {
        Configuration.browser = "chrome";
    }
    @BeforeEach
    public void init() {
        setUp();
        entrance();
    }
    @AfterEach
    public void tearDown() {

    }

    /**
     * Вход на главную страницу
     */
    public static void entrance() {
        open(APP_URL);
        $x("//input[@id=\":r0:\"]").setValue(BECK_URL);
        $x("//button").click();
        int i = 1;
    }
}
