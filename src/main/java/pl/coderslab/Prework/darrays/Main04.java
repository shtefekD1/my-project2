package pl.coderslab.Prework.darrays;

public class Main04 {
    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, 69};
        int sumOdd = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println("SUM: " + sumOdd + ".");
    }
}

