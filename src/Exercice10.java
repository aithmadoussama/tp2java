
public class Exercice10 {

    public static void main(String[] args) {
        int[][] matrice = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        if (estMagique(matrice)) {
            System.out.println("La matrice est magique ");
        } else {
            System.out.println("La matrice n est pas magique ");
        }
    }

    public static boolean estMagique(int[][] matrice) {
        int taille = 3;

        
        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += matrice[0][i];
        }

       
        for (int i = 1; i < taille; i++) {
            int sommeligne = 0;
            for (int j = 0; j < taille; j++) {
                sommeligne += matrice[i][j];
            }
            if (sommeligne != somme) {
                return false;
            }
        }

                for (int j = 0; j < taille; j++) {
            int sommeCol = 0;
            for (int i = 0; i < taille; i++) {
                sommeCol += matrice[i][j];
            }
            if (sommeCol != somme) {
                return false;
            }
        }

       
        int sommeDiag1 = 0;
        for (int i = 0; i < taille; i++) {
            sommeDiag1 += matrice[i][i];
        }
        if (sommeDiag1 != somme) {
            return false;
        }

        
        int sommeDiag2 = 0;
        for (int i = 0; i < taille; i++) {
            sommeDiag2 += matrice[i][taille - 1 - i];
        }
        if (sommeDiag2 != somme) {
            return false;
        }

       
        return true;
    }
}