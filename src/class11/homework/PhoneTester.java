package class11.homework;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.name = "iPhone";
        iPhone.model = "11";
        iPhone.productionYear = 2021;
        iPhone.operatingSystem = "iOS";
        iPhone.color = "Red";
        iPhone.sms();
        iPhone.music();

        Phone pixel = new Phone ();
        pixel.name = "Google Pixel";
        pixel.model = "7 Pro";
        pixel.productionYear = 2022;
        pixel.operatingSystem = "Android";
        pixel.color = "Grey";
        pixel.sms();
        pixel.music();

        Phone samsung = new Phone();
        samsung.name = "Samsung";
        samsung.model = "A72";
        samsung.productionYear = 2022;
        samsung.operatingSystem = "Android";
        samsung.color = "Black";
        samsung.sms();
        samsung.music();
    }

}

