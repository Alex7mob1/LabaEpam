package com.alex.decorator.tools;

import com.alex.decorator.elements.CommonElement;
import org.openqa.selenium.WebElement;

public class WrapperFactory {
    public static CommonElement createInstance(Class<CommonElement> clazz,
                                               WebElement element) {
        try {
            return clazz.getConstructor(WebElement.class).
                    newInstance(element);
        } catch (Exception e) {
            throw new AssertionError(
                    "WebElement can't be represented as " + clazz
            );
        }
    }
}
