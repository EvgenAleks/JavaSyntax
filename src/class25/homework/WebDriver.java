package class25.homework;

//        Create a WebDriver Interface that will have the following unimplemented behaviour:
//        openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//        Create 2 classes that implements WebDriver interface:
//        ChromeDriver and FirefoxDriver.
public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Enlarging Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Making Chrome");
    }
}

class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Enlarging Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Making Firefox");
    }

    public static void main(String[] args) {

        WebDriver[] wdr = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : wdr) {
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();

        }

//        System.out.println("***********************");
//
//        WebDriver[] wdr1 = {new ChromeDriver(), new FirefoxDriver()};
//        for (int i = 0; i < wdr1.length; i++) {
//            WebDriver w1 = wdr1[i];
//
//            w1.openBrowser();
//            w1.closeBrowser();
//            w1.maximizeWindow();
//            w1.findElement();
//
//        }
    }
}


