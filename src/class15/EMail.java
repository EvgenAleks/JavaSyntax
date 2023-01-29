package class15;

public class EMail {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    return type => String
    name => createEmail
    parameter => String name, String lastName, String emailType
    {
    concat
    }
     */

    String createEmail(String name, String lastName, String emailType) {
        String fullEmail = name + lastName + "@" + emailType + ".com";
        return fullEmail.toLowerCase();
    }

    public static void main(String[] args) {

        EMail em1 = new EMail();
        System.out.println(em1.createEmail("Johny", "Snow", "Gmail"));
    }
}
