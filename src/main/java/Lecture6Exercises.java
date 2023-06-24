import java.util.List;
import java.util.ArrayList;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int m1Rows = m1.length;
        int m1Cols = m1[0].length;
        int m2Cols = m2[0].length;
        if (m1Cols != m2.length) {
            throw new RuntimeException("Cannot perform matrix product: invalid dimensions");
        }
        double[][] result = new double[m1Rows][m2Cols];
        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                double sum = 0;
                for (int k = 0; k < m1Cols; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < names[i].length; j++) {
                row.add(names[i][j]);
            }
            result.add(row);
        }
        return result;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
            List<Integer> factors = new ArrayList<>();
            int divisor = 2;
            while (n > 1) {
                while (n % divisor == 0) {
                    factors.add(divisor);
                    n /= divisor;
                }
                divisor++;
            }
            return factors;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> words = new ArrayList<>();
        String[] tokens = line.split("\\s+");
        for (String token : tokens) {
            String word = token.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        return words;
    }
}