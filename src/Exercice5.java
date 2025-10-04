public class Exercice5{

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int n = arr.length;
        
        if (estPermutationCirculaire(arr, n)) {
            System.out.println("le tableau est une permutation circulaire.");
        } else {
            System.out.println("le tableau n est pas une permutation circulaire.");
        }
    }

    public static boolean estPermutationCirculaire(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            if (num < 1 || num > n || present[num]) {
                return false;
            }
            present[num] = true;
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                for (int j = 0; j < n; j++) {
                    if (arr[(i + j) % n] != (j + 1)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}

