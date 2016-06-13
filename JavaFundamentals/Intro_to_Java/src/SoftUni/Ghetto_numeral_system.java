package com.company.SoftUni;

import java.util.Scanner;

/**
 * Created by boris on 6/14/2016.
 */
public class Ghetto_numeral_system {
    public static void main(String[] args) {
        String[] wordSet= new String[10];
        wordSet[0]="Gee";
        wordSet[1]="Bro";
        wordSet[2]="Zuz";
        wordSet[3]="Ma";
        wordSet[4]="Duh";
        wordSet[5]="Yo";
        wordSet[6]="Dis";
        wordSet[7]="Hood";
        wordSet[8]="Jam";
        wordSet[9]="Mack";
        Scanner s = new Scanner(System.in);
        int code= s.nextInt();
        int codeCopy=code;
        int i=0;
        //Getting the number of digits of the code
        while(codeCopy>0){
            codeCopy=codeCopy/10;
            i++;
        }
        //Making a String array with the size of the code
        String[] words = new String[i];
        i=0;
        //Filling the array with the words corresponding to the digits (the array is rotated at this point!)
        while (code > 0) {
            words[i]=wordSet[code % 10];
            code = code / 10;
            i++;
        }
        //Printing the array in an opposite order
        for (i = 0; i <words.length ; i++) {
            System.out.print(words[words.length-1-i]);
        }
    }
}
