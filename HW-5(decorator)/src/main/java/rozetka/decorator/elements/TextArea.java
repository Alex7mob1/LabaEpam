package rozetka.decorator.elements;

import org.openqa.selenium.WebElement;
import rozetka.decorator.ElementDecorator;

public class TextArea extends ElementDecorator {
    public TextArea(WebElement element) {
        super(element);
    }

    public String getText() {
        return element.getText();
    }
}