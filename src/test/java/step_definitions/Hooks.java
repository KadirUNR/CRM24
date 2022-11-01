package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {
    @After
    public void tearDown(Scenario S){
        if (S.isFailed()) {
            byte[] array = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            S.attach(array, "image/png", S.getName());
        }
        Driver.close();
    }
}


