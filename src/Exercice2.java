
import java.util.Scanner;

public class Exercice2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entrez la tille de votre tableau :");
		int taille = sc.nextInt();
		int[] tab = new int[taille];

		for (int i = 0; i < taille; i++) {
			System.out.print("element numero " + (i + 1) + ":");
			tab[i] = sc.nextInt();
		}

		for (int i = 1; i < taille; i++) {
			int piv = tab[i];
			int temp = 0;
			for (int j = i; j >= 0; j--) {
				if (piv > tab[j]) {
					temp++;
				}
			}
			if (temp == i) {
				System.out.println("le nombre  " + piv + " est un pivo");
			}
		}

	}
}
