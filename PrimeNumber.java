package PepCoding;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            int num = input.nextInt();
//            findPrimeInitial(num);
//            findPrimeOptimized(num);
            findPrimeOptimizedBest(num);
        }
    }

    private static void findPrimeOptimizedBest(int num) {
        int count=0;
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.println("Prime Number");
        }
        else System.out.println("Not a Prime Number");
    }

    private static void findPrimeOptimized(int num) {
        int count=0;
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                count++;
            }
        }

        if(count==0){
            System.out.println("Prime Number");
        }
        else System.out.println("Not a Prime Number");
    }

    private static void findPrimeInitial(int num) {

        int count=0;
        for(int div=1;div<=num;div++){
            if(num%div==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Prime Number");
        }
        else System.out.println("Not a Prime Number");
    }
}
