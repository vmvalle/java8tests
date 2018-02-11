package es.exercises;

/**
 * Dado los valores de las acciones en un array de números enteros,
 * calcular cual fue el mejor momento para comprar y vender, es decir la mayor diferencia positiva
 */
public class GreaterDifference {

    public static void main(String [] args) {
        int[] numbers = generateArrayInt();
        int[] result = getGreaterDifference(numbers);
        printResult(result);
    }

    /**
     * Calcula la mayor diferencia en un array.
     * @param numbers
     * @return int[]
     */
    private static int[] getGreaterDifference(int[] numbers) {
        int value = Integer.MIN_VALUE;
        int minNumber = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            for(int j = i + 1; j < numbers.length; j++) {
                int next = numbers[j];
                if (next > current && (next - current > value)) {
                    minNumber = current;
                    maxNumber = next;
                    value = next - current;
                }
            }

        }

        return new int[]{minNumber, maxNumber, value};
    }

    /**
     * Genera un array con números aleatorios
     * @return int[]
     */
    private static int[] generateArrayInt() {
        int[] array = new int[40];
        for (int i = 0; i < array.length; i++){
            int n = (int)(Math.random() * 60 + 1);
            array[i] = n;
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
        return array;
    }

    private static void printResult(int[] result) {
        System.out.println("Número menor: " + result[0]);
        System.out.println("Número mayor: " + result[1]);
        System.out.println("Diferencia: " + result[2]);
    }

}
