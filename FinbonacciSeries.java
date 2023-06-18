package PepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class FinbonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            a = b;
            b = c;
            c= a + b;
            result.add(b);

        }
        System.out.println(result);
    }
}
