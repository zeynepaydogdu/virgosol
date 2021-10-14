package utilities;

import org.openqa.selenium.JavascriptExecutor;

public class JsUtil {
    public static void scrollDownByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public static void scrollPageDown() {
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}
