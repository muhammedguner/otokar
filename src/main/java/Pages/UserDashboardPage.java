package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class UserDashboardPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(UserDashboardPage.class);
    private static final By TXTUSERDPAGEUSERNAME = By.xpath("((//a[@title='Hesabım'])//span)[2]");

    private static final By INPUTUSERDPAGESEARCHBOX =By.xpath("(//input[@type='text'])[1]");

    public void verifyValidLogin(String userName){

        ContainsText(TXTUSERDPAGEUSERNAME,userName);
        LOGGER.info("User verify text " +userName);
    }

    public void searchProduct(String product){
        setTextElement(INPUTUSERDPAGESEARCHBOX,product+ Keys.ENTER);
    }



}
