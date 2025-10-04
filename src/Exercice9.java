
import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		System.out.println("la somme des fdeux diagonaux est : "+diagonale());
	}

	public static int diagonale() {
		Scanner sc = new Scanner(System.in);

		// remplissage de la matrice
		System.out.println("entrez la taille de votre matrice :");
		int taille = sc.nextInt();
		int[][] matrice = new int[taille][taille];

		System.out.println("entrez les elements de la matrice");
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				matrice[i][j] = sc.nextInt();
			}
		}
		// diagonale principale
		int diagonale1 = 0;
		for (int i = 0; i < taille; i++) {
			diagonale1 += matrice[i][i];
		}
		// diagonale secondaire
		int diagonale2 = 0;
		for (int i = 0; i < taille; i++) {
			diagonale1 += matrice[i][taille - i - 1];
		}
		return diagonale1+diagonale2;
	}

}
