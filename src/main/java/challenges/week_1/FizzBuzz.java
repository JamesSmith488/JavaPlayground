package challenges.week_1;

import java.util.Arrays;

public class FizzBuzz {

    /*
    Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
    “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
    */

    String[] arr;

    /*
    Constructor for FizzBuzz
    Receives upper bound for the array
    Loops through the array assigning the values to the previous element in the array
    Because arrays start at 0 and the loop starts at 1
    Does not return anything as it is only initialising the fizzbuzz array
     */
    public FizzBuzz(int upper){
        arr = new String[upper];
        for (int i = 1; i < upper + 1; i++) {
            if (divisibleBy(i,3) && divisibleBy(i,5)){
                arr[i-1] = "FizzBuzz";
            }else if (divisibleBy(i,3)){
                arr[i-1] = "Fizz";
            }else if (divisibleBy(i,5)){
                arr[i-1] = "Buzz";
            }else arr[i-1] = "" + i;
        }
    }

    public boolean divisibleBy(int num1, int num2){
        if (num1 % num2 == 0){
            return true;
        }else return false;
    }

    //Returns the fizzbuzz array
    public String[] getFizzBuzz(){
        return arr;
    }

    //Returns the value from the fizzbuzz array index
    public String getFizzBuzzValue(int num){
        return arr[num-1];
    }

}
