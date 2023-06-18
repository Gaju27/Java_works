package PepCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int count=0;
        while(n!=0){
            builder.append(n%10);
            result.add(n%10);
            n=n/10;
            count++;
        }

        System.out.println(result);
        Collections.sort(result);

        System.out.println(count);
        System.out.println(result);

        System.out.println(builder.toString());
    }
}
