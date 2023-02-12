package class23;

public class WebDriverTester {
    public static void main(String[] args) {

        //WebDriver -> parent class
//        WebDriver webDriver = new Firefox();
//        // Firefox firefox = new WebDriver(); -> downcasting; unacceptable
//        webDriver.startBrowser();
//        webDriver.openURL();
//        webDriver.testLoginPage();
//        webDriver.closeBrowser();

        // Chrome chrome = new Chrome();
        // Firefox firefox = new Firefox();
        // Safari safari = new Safari();

        // WebDriver[] browsers = {chrome, firefox, safari}; -> variant of array

        // an array of type parentclass can hold the objects of all the child classes
        WebDriver[] browsers = {new Chrome(), new Safari(), new Firefox()};

        for (WebDriver browser : browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

            System.out.println("**********************************");
        }

//        Safari safari = new Safari();

//        safari.startBrowser();
//        safari.openURL();
//        safari.testLoginPage();
//        safari.closeBrowser();
//
//        Firefox firefox = new Firefox();

//        firefox.startBrowser();
//        firefox.openURL();
//        firefox.testLoginPage();
//        firefox.closeBrowser();
    }
}
