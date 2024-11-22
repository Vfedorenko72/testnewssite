import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.$x;

abstract class BaseTest {
    private final static String BECK_URL = "https://api.news.academy.dunice.net/";
    private final static String APP_URL = "https://news.academy.dunice.net/start";

    public static void setUp() {
        Configuration.browser = "chrome";
    }
    @BeforeAll
    public static void init() {
        setUp();
        entrance();
    }
    @AfterAll
    public static void tearDown() {

    }

    /**
     * Вход на главную страницу
     */
    public static void entrance() {
        Selenide.open(APP_URL);
        $x("//input[@id=\":r0:\"]").setValue(BECK_URL);
        $x("//button").click();
    }
}
