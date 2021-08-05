package rozetka.decorator.elements;

import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;

public class InputText extends ElementDecorator {

    public InputText(WebElement element) {
        super(element);
    }

    public void safeInput(CharSequence... charSequences) {
        element.clear();
        element.sendKeys(charSequences);
    }
    public boolean isDisplayed(){
        return element.isDisplayed();
    }
}
