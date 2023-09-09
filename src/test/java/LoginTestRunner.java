import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginTestRunner extends Setup {
    @Test(priority = 1 , description = "login Automation")
    public void doLogin() throws IOException, ParseException, InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JSONObject userObj= Utils.readJSONList("./src/test/resources/users.json",0);
        String email= userObj.get("email").toString();
        String password= userObj.get("password").toString();
        loginPage.doLogin(email,password);
        //Assert.assertEquals("Rutujaandrea Gawdemartinez",Actual);

    }
}
