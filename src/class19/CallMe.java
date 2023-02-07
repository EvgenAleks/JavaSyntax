package class19;

import class13.StringRecap;
import com.sun.jdi.request.ClassUnloadRequest;

public class CallMe {
    /*
    Write program: userClass  that has a constructor that
    initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable
    and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method.
    Test your code.
     */

    String name;
    String mobNum;

    CallMe(String name, String mobNum) {
        this.name = name;
        this.mobNum = mobNum;
    }

    public void nameNum() {
        System.out.println(name + " mobile number is " + mobNum);
    }
}
   class Address extends CallMe {

       String address;

       Address(String name, String mobNum, String address) {
           super(name, mobNum);
           this.address = address;
       }

        public void userInfo() {
            System.out.println(name + " address is " + address);
        }


    public static void main(String[] args) {

        Address adNew = new Address("J. Watson", "004488065", "London Baker Str. 221B");
        adNew.nameNum();
        adNew.userInfo();
    }
}