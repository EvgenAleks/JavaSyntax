package projectTwo;

public class WebDriverTest {

    public static void main(String[] args) {

        RemoteWebDriver[] wd = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (RemoteWebDriver w:wd) {
            w.open();
            w.close();
            System.out.println(w.getTitle());
            w.getScreenshot();
            w.navigate();
        }
    }
}
