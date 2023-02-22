package projectTwo;


//        Provide Implementation for the diagram below. Then
//        create a test class in which you need to create Objects of
//        ChromeDriver, FirefoxDrive and SafariDriver classes and
//        see which methods available to them.
public interface WebDriver {

    void open();
    void close();
    String getTitle();

}
interface TakesScreenshot {

    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {

    void navigate();
}
class ChromeDriver implements RemoteWebDriver {

String title = "https://www.google.com/";

    @Override
    public void open() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome");

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome is navigating");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    String title = "https://www.mozilla.org/ru/firefox";
    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Firefox is navigating");
    }
}
class SafariDriver implements RemoteWebDriver {

    String title = "https://www.apple.com/ru/safari/";
    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Safari is navigating");
    }
}
