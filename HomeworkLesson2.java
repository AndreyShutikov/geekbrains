package SecondHomeWork;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание  1:");
        replacementElements();

        System.out.println("\n\nЗадание 2:");
        createArray();

        System.out.println("\n\nЗадание 3:");
        multiplicationElements();

        System.out.println("\n\nЗадание 4:");
        createMatrix();

        System.out.println("\nЗадание  5:");
        findMinAndMax();

        System.out.println("\nЗадание 6:");
        System.out.println(checkBalance(new int[] { 1, 1, 1, 2, 1 })); // true
        System.out.println(checkBalance(new int[] { 2, 1, 1, 2, 1 })); // false
        System.out.println(checkBalance(new int[] { 10, 10 })); //true

        System.out.println("\nЗадание 7:");
        modifyArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5);
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void replacementElements() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Начальный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nКонечный массив:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * 2.  Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static void createArray() {
        int[] arr = new int[8];

        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void multiplicationElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Изначальный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nКонечный массив:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void createMatrix() {
        int length = 8; // длина массива

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

             for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    static void findMinAndMax() {
        int[] arr = {12, 5, -13, 2, 11,0, 4, 15, 2, -4, 8, -9, 1, 8};
        int min = arr[0];
        int max = arr[0];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for ( int i = 0; i < arr.length; i++) {
            if (min>arr[i]) min=arr[i];
            if (max<arr[i]) max=arr[i];

        }
        System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);
    }

    /**
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
     */
    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++)
        {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

    /**
     * 7 **** Написать метод, которому на вход подается одномерный массив и
     * число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива
     * на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами
     */
    static void modifyArray(int[] arr, int shif) {
        System.out.print("Изначальный массив: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nСдвиг на = " + shif );
        //Положитеный сдвиг
        if (shif > 0) {
            for (int i = 0; i < shif; i++)
            {

                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
            //Отрицательный
        } else if (shif < 0) {
            for (int i = 0; i < shif * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nКонечный массив:  ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
