import java.util.Arrays;

class Main {
  static void doBubbleSort(int arrayToSort[]) {   
    for (int i = 0; i < arrayToSort.length - 1; i++)
      for (int j = 0; j < arrayToSort.length - i - 1; j++)
        if (arrayToSort[j] > arrayToSort[j + 1]) {
          // swapping elements
          int tmp = array[j];
          arrayToSort[j] = arrayToSort[j + 1];
          arrayToSort[j + 1] = tmp;
        }
  }

  public static void main(String args[]) {
    int[] intArray = { -2, 45, 0, 11, -9 };
    Main.doBubbleSort(intArray);
    System.out.println("Output in Ascending Order:");
    System.out.println(Arrays.toString(intArray));
  }
}
