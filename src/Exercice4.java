
public class Exercice4 {
    public static void main(String[] args) {
        int[][] matrice = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {0, 1, 0, 1, 1},
            {1, 1, 0, 0, 0}
        };
        
        System.out.println("Le plus grand rectangle de 1 a une aire de : " + GrandRectangle(matrice));
    }

    public static int GrandRectangle(int[][] matrice) {
        if (matrice == null || matrice.length == 0 || matrice[0].length == 0) {
            return 0;
        }

        int n = matrice.length;
        int m = matrice[0].length;
        int[] hauteur = new int[m];
        int maxArea = 0;

       
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] == 0) {
                    hauteur[j] = 0;  
                } else {
                    hauteur[j] += 1;  
                }
            }
            
            maxArea = Math.max(maxArea, maximalRectangle(hauteur));
        }

        return maxArea;
    }

    
    public static int maximalRectangle(int[] hauteur) {
        int n = hauteur.length;
        int[] stack = new int[n + 1];
        int top = 0;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (top > 0 && (i == n || hauteur[i] < hauteur[stack[top - 1]])) {
                int h = hauteur[stack[--top]];
                int w = i - stack[top - 1] - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack[top++] = i;
        }
        return maxArea;
    }
}

