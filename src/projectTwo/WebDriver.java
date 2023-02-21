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


    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
