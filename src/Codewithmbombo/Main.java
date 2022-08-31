/*
If we list all the natural numbers below 10 that are multiple of
3 or 5, we get 3,5,6 and 9. The Sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 bellow 1000
 */
package Codewithmbombo;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int a = 0;
        List<Integer> inputValue = new ArrayList<>();
        do{
        a++;
        inputValue .add(a);
        }while (a<999);
        int num2 = 3;
        int num3 = 5;
        List<Integer> finalResult = new ArrayList<>();

        for (Integer num : inputValue ) {
            int remainder = num % num2;
            int remainder2 = num % num3;
            if(remainder == 0 || remainder2 == 0){
                int result = num;
                finalResult.add(result);
            };
        };
        System.out.println(finalResult);
        int sum = finalResult.stream().mapToInt(z -> z).sum();
        System.out.println(sum);

    };
};
