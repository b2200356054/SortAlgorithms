public class SelectionSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr, int size){

        for (int i = 0; i < size; i++){
            int minIndex = i;
            for (int j = i; j < size; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

}
