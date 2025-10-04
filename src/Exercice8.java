
import java.util.Scanner;

public class Exercice8 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taille = sc.nextInt();
        int[] tab = new int[taille];

        // remplissage de tab 
        System.out.println("entrez les elements du tableaux :");
        for(int i=0 ; i < taille ; i++){
            tab[i] = sc.nextInt();
        }

        boolean[] present = new boolean[taille + 1]; 

        for (int i = 0; i < taille; i++) {
            if (tab[i] >= 1 && tab[i] <= taille) {
                present[tab[i]] = true;
            }
        }

        System.out.println("element manquants : ");
        for (int i = 1; i <= taille; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
