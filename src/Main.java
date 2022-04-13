import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] randomInts = getRandomInts(8);
        printArray(randomInts);


        int[] sortedInts = zamena(randomInts);
        printArray(sortedInts);

        printArray(randomInts);

        sortedInts[1] = 4;

        printArray(randomInts);
    }

    private static int[] zamena(int[] randomInts) {
        for (int i = 0; i < randomInts.length; i++)
            for (int j = 0; j < randomInts.length - 1; j++)
                if (randomInts[j] > randomInts[j + 1]) {
                    int tmp = randomInts[j];
                    randomInts[j] = randomInts[j + 1];
                    randomInts[j + 1] = tmp;

                }
        return randomInts;
    }

    private static void printArray(int[] randomInts) {
        for (int i = 0; i < randomInts.length; i++) {
            System.out.print(randomInts[i] + " ");
        }
        System.out.println();
    }

    private static int[] getRandomInts(int number) {
        Random random = new Random();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }

        return array;
    }
}
