package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard=false;
        int salary=900000;

        if(studyHard){

            System.out.println("We get the jobs");

            if(salary>100000){
                System.out.println("Let's buy Tesla");
            }else{
                System.out.println("Lets buy Toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
