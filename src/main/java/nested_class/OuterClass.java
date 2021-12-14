package nested_class;

public class OuterClass {

    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getInnerClassString(){
        InnerClass innerClass = new InnerClass();
        return innerClass.getString();
    }

    public class InnerClass{

        private String string = "This is a string";

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public int getOuterClassNum(){
            return num;
        }

        public void setOuterClassNum(int num){
            OuterClass.this.num = num;
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        System.out.println("OuterClass: " + outerClass.getNum());
        outerClass.setNum(11);
        System.out.println("InnerClass: " + innerClass.getOuterClassNum());
        innerClass.setOuterClassNum(12);
        System.out.println("InnerClass: " + innerClass.getOuterClassNum());
        System.out.println("InnerClass: " + innerClass.getString());
        innerClass.setString("Edited string");

        System.out.println(outerClass.getInnerClassString());
    }

}
