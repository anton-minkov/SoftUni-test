package myPack;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by anton on 16-3-20.
 */
public class SumNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N=");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum is "+sum);

    }
}
