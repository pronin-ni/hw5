import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {
    @BeforeAll
    static void confLoad() {
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void openEnterprisePageTest(){
        open("https://github.com/");
        $$(".HeaderMenu-nav button").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").should(visible, text("The AI-powered developer platform"));
    }
}
