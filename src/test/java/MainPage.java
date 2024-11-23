import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement singIn = $x("//button[(1)]");
    private final SelenideElement signUp = $x("//button[(2)]");
    private final SelenideElement clearUrlToBeck = $x("//button[(2)]");

    private final SelenideElement emailIn = $x("//input[@id=\":r50:\"]");
    private final SelenideElement passwordIn = $x("//input[@id=\":r51:\"]");

    private final SelenideElement emailUp = $x("//input[@id=\":r4u:\"]");
    private final SelenideElement passwordUp = $x("//input[@id=\":r4v:\"]");




}
