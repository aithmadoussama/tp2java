
import java.util.*;

public class Exercice1 {

	public static void main(String[] args) {

		System.out.println("entrez la taille de votre tableau :");
		Scanner sc = new Scanner(System.in);
		int taille1 = sc.nextInt();

		int taille2 = taille1;
		int[] tab1 = new int[taille1];
		int[] tab2 = new int[taille2];

		for (int i = 0; i < taille1; i++) {
			System.out.print("element numero " + (i + 1) + " :");
			tab1[i] = sc.nextInt();
		}

		int min = tab1[0];
		tab2[0] = min;

		for (int i = 0; i < taille1 - 1; i++) {
			if (min < tab1[i + 1]) {
				tab2[i + 1] = tab1[i + 1];
				min = tab1[i + 1];
			} else
				taille2--;
		}

		System.out.println("la taille de votre suite est : " + taille2);

	}
}
