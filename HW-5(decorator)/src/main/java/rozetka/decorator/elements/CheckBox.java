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
        if (!element.isSelected()) {
            DriverRepo.getWebDriverWait()
                    .ignoring(StaleElementReferenceException.class)
                    .until(driver -> {
                        element.click();
                        return true;
                    });
        } else {
            System.out.println("Box already checked");
        }
    }
}
