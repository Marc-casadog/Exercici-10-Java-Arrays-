
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int[] a = new int[5];
    int[] b = new int[5];
    int[] resultat = new int[5];

    for (int i = 0; i < 5; i++) {
        System.out.print("Introdueix un número per a: ");
        a[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        System.out.print("Introdueix un número per b: ");
        b[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        resultat[i] = a[i] + b[i];
    }

    System.out.println("Array a:");

    for (int i = 0; i < 5; i++) {
        System.out.println(a[i]);
    }

    System.out.println("Array b:");

    for (int i = 0; i < 5; i++) {
        System.out.println(b[i]);
    }

    System.out.println("Array resultat:");

    for (int i = 0; i < 5; i++) {
        System.out.println(resultat[i]);
    }
}
