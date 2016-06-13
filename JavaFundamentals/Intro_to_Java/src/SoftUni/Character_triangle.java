package com.company.SoftUni;
import java.util.Scanner;

/**
 * Created by boris on 6/14/2016.
 */
public class Character_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numLines = s.nextInt();
        int i,j;
        for (i = 0; i <=numLines ; i++) {
            for (j = 0; j <i ; j++) {
                System.out.print(Character.toChars('a'+j));
            }
            System.out.println();
        }
        for (i = numLines-1; i >0 ; i--) {
            for (j = 0; j <i ; j++) {
                System.out.print(Character.toChars('a'+j));
            }
            System.out.println();
        }
    }
}
