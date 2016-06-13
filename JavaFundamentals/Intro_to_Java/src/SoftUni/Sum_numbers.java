package com.company.SoftUni;

import java.util.Scanner;

/**
 * Created by boris on 6/14/2016.
 */
public class Sum_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
