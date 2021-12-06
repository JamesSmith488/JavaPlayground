package static_final;

public class FinalExamples {

    public static final String locked = "Despite being public, this cannot be changed";

    public static void main(String[] args) {
        //locked = "this does not work";
        System.out.println(locked);
    }

}
