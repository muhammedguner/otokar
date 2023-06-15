import Base.BaseTest;
import Pages.AllPages;
import Pages.MainPage;
import Utilities.ConfigReader;
import org.testng.annotations.Test;


public class TC001 extends BaseTest {

    AllPages allPages;
    @Test
    public void test02() {
        allPages = new AllPages();
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("muhammed");
        allPages.userDashboardPage().searchProduct("robot süpürge");

    }
}
