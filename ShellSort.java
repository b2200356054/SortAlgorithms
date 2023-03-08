public class ShellSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int[] arr, int size){
        for (int gap = (size/3); gap > 0; gap /= 3){
            for (int i = gap; i < size; i += gap){

            }
        }
    }
}
