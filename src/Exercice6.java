public class Exercice6 {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("La somme maximale est : " + sommeMaximale(arr));
    }

    public static int sommeMaximale(int[] arr) {
        int maxSoFar = arr[0];
        int maxCurrent = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxCurrent);
        }

        return maxSoFar;
    }
}

