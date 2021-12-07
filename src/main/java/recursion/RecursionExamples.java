package recursion;

import java.util.ArrayList;

public class RecursionExamples {

    private ArrayList<Integer> sequence;

    public ArrayList<Integer> generateFibbonacci(int num){
        sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        sequence.add(1);
        fibbonacci(num);
        return sequence;
    }

    private int fibbonacci(int num){
        if (num == 0) {
            return 0;
        }else if (num == 1) {
            return 1;
        }else{
            int fibNum = fibbonacci(num-2) + fibbonacci(num-1);
            if (!sequence.contains(fibNum)){
                sequence.add(fibNum);
            }
            return fibNum;
        }
    }

}
