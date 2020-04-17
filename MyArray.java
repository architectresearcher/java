import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer572
 */
class MyArray {
    /**
     * @param args the command line arguments
     */
 
    public static int[] myReverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
          }
          return result;
    }
    public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
              System.out.print(array[i] + " ");
            }
    }
    public static void main(String args[]){
          int[] arr={5,6,7,8};
          printArray(arr);
          System.out.println(Arrays.toString(arr));
          int[] rev=myReverse(arr);
          System.out.println(Arrays.toString(rev));
          //Нахождение максимального значения в массиве myArray из 4 элементов
          int max = arr[0];
          // Перебираем все элементы массива.
      for (int i = 1; i < arr.length; i++) {
          // Сравниваем значение переменной max со значениями элемента массива.
          // Если значение элемента массива больше значения переменной max,
          // то новое значение переменной max будет равно значению этого элемента.
          if (arr[i] > max) {
              max = arr[i];
          }
      }
           // Выводим на экран наибольший элемент массива myArray.
      System.out.println("Максимальное значение в массиве myArray: " + max);
      //
      double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};
         System.out.print("Вывод элементов массива myList: "+Arrays.toString(myList));
        // Вывод элементов массива на экран.
        System.out.print("\nВывод элементов массива myList: ");
        for (int i = 0; i < myList.length; i++) {
           System.out.print(myList[i] + "  ");
        }
        // Вывод массива на экран с помощью улучшенного цикла for.
        System.out.print("\nВывод элементов массива myList: ");
        for(double element : myList) {
           System.out.print(element + "  ");
        }
    }
}