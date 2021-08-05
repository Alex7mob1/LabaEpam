package rozetka.decorator.elements;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;
import rozetka.driver.DriverRepo;

public class Button extends ElementDecorator {

    public Button(WebElement element) {
        super(element);
    }

    public void safeClick() {
        DriverRepo.getWebDriverWait()
                .ignoring(ElementClickInterceptedException.class)
                .until(driver -> {
                    element.click();
                    return true;
                });
    }
}