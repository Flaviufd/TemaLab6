package ro.fasttrackit;

import java.util.Arrays;
import java.util.Random;

public class TemaLab6 {
    public static void main(String[] args) {
        int[] intregi = new int[]{1,2,3,4,5};
        System.out.println("Produsul este: " + produs(intregi));
        System.out.println("Numarul de elemente impare este: " + elementeImpare(intregi));
        System.out.println("Numerele mai mici decat 4 sunt: " + maiMic(intregi, 4));
        System.out.println(donationes(1500));
        //System.out.println(donatii(1500, 10));
        String fraza = "Fraza este unitatea sintactică independentă, formată prin unirea a două sau mai multe propoziții, dintre care una este principală. De cele mai multe ori, numărul propozițiilor este egal cu numărul predicatelor.";
        System.out.println(fraza(fraza));
    }

    private static String fraza(String fraza) {
        String[] strings = fraza.split("\\.");
        String sir = " ";
        for (int i=0; i<strings.length; i++) {
            sir = sir + strings[i] + ". \n";
        }
        return sir;
    }

//    private static String donatii(int donatie, int target) {
//        Random rand = new Random();
//        int target = 0;
//        int sum = 0;
//        while (sum<donatie) {
//            int donatieRandom = rand.nextInt();
//            target++;
//        }
//        if (target==10)
//        return "Succes";
//    }

    public static String donationes(int donatie) {
        Random rand = new Random();
        int sum = 0;
        while (sum<donatie) {
            int donatieRandom = rand.nextInt();
            sum = sum + donatieRandom;
        }
    return "Succes";
    }

    private static String maiMic(int[] intregi, int a) {
        String sirnou = "";
        for (int i=0; i<intregi.length; i++) {
            if (intregi[i]<a) {
                sirnou = sirnou + intregi[i] + " ";
            }
        }
        return sirnou.trim();
    }

    private static int elementeImpare(int[] intregi) {
        int count = 0;
        for (int i=0; i<intregi.length; i++) {
            if (intregi[i]%2!=0) {
                count++;
            }
        }
        return count;
    }

    public static int produs(int[] intregi) {
        int produs = 1;
        for (int i=0; i<intregi.length; i++) {
            produs = produs * intregi[i];
        }
        return produs;
    }
}
