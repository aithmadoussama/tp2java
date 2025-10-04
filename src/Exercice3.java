public class Exercice3 {
    public static void main(String[] args) {
        int n = 5; 
        int[][] matrice = new int[n][n];
        int val = 1;
        int x = 0, y = 0;
        
        while (val <= n * n) {
            // remplir la ligne du haut
            while (y < n && matrice[x][y] == 0) {
                matrice[x][y++] = val++;
            }
            y--; x++;
            
            // remplir la colonne de droite
            while (x < n && matrice[x][y] == 0) {
                matrice[x++][y] = val++;
            }
            x--; y--;
            
            // remplir la ligne du bas
            while (y >= 0 && matrice[x][y] == 0) {
                matrice[x][y--] = val++;
            }
            y++; x--;
            
            // remplir la colonne de gauche
            while (x >= 0 && matrice[x][y] == 0) {
                matrice[x--][y] = val++;
            }
            x++; y++;
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
