import java.util.Scanner;

public class Agenda {
    int[] agenda = new int[4];
    public static void main(String[] args) {
        System.out.println("Optiuni: ");
        String[] optiuni = {"1. Adaugare", "2. Modificare", "3. Stergere", "4. Cautare"};
        for (int i=0; i< optiuni.length; i++) {
            System.out.println(optiuni[i]);
        }
        System.out.println("Selectia dvs este: ");
        Scanner scanner = new Scanner(System.in);
        int selectie = scanner.nextInt();

        switch (selectie) {
            case 1:

        }
    }

//    public static int add (int[] agenda, int nr)  {
//
//    }
//
//    public static int replace (int[] agenda, int actual, int newnr) {
//
//    }
//
//    public static int remove (int[] agenda, int nr) {
//
//    }
//
//    public static int search (int[] agenda, int nr) {
//
//    }
}
