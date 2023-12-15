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


    }
}