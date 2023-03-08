public class InsertionSort {
    static  void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr, int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < i; j++){
                if (arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
}
