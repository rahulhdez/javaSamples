import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        String _var = "Hello and welcome!";

        for(int i = _var.length()-1; i >=0; i--)
        {
            System.out.print(_var.charAt(i));
        }
        System.out.println("");

        int[] numbers = {1,2,3,4,5,6,7,8,10};
        int missing = 0;

        int n = 1;
        for(int number : numbers)
        {
            if(number != n) {
                missing = n;
                break;
            }

            n++;
        }

        if(missing>0)
            System.out.print("The missing number in the array is: " + missing);
        else
            System.out.print("There is no missing number in the array");
    }
}