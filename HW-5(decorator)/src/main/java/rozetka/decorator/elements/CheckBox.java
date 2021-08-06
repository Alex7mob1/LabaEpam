package rozetka.decorator.elements;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;
import rozetka.driver.DriverRepo;

public class CheckBox extends ElementDecorator {

    public CheckBox(WebElement element) {
        super(element);
    }

    public void setCheckBox() {
        DriverRepo.getWebDriverWait()
                .ignoring(StaleElementReferenceException.class)
                .until(driver -> {
                    if (!element.isSelected()) {
                        element.click();
                    } else {
                        System.out.println("Box already checked");
                    }
                    return true;
                });
    }
}