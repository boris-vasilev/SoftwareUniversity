package com.company.SoftUni;
import java.util.Scanner;
/**
 * Created by boris on 6/14/2016.
 */
public class Get_average {
    static void avg(double a,double b,double c){
        double avg = (a+b+c)/3;
        System.out.printf("%.2f",avg);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a= s.nextDouble();
        double b= s.nextDouble();
        double c= s.nextDouble();
        avg(a,b,c);
    }
}
