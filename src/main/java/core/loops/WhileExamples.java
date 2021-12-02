package core.loops;

public class WhileExamples {

    public void printNum(int num){
        int count = num;
        while(count != 0){
            System.out.println(count);
            count--;
       }
    }

    public void doWhile(int num){
        int count = num;
        do{
            System.out.println(count);
            count--;
        }while(count != 0);
    }

}
