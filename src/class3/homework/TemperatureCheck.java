package class3.homework;

public class TemperatureCheck {
    public static void main(String[] args) {

        int waterTemp;

        waterTemp=38;

        if (waterTemp<32)
        {
            System.out.println("Water will freeze with temperature " + waterTemp);
        }
        else
        {
            System.out.println("Water will not freeze with temperature " + waterTemp);
        }
    }
}
