

public class Main {
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 2, 4};
        System.out.println("INSERTION SORT------------");
        System.out.print("Before sorting: ");
        for (int i: arr){
            System.out.printf("%d ",i);
        }
        System.out.println();
        InsertionSort.sort(arr, 5);
        System.out.print("After sorting: ");
        for (int i: arr){
            System.out.printf("%d ",i);
        }
        System.out.println("\n");





        System.out.println("SELECTION SORT ----------");
        int[] arr2 = {1, 5, 3, 2, 4};
        System.out.print("Before sorting: ");
        for (int i: arr2){
            System.out.printf("%d ",i);
        }
        System.out.println();
        SelectionSort.sort(arr2, 5);
        System.out.print("After sorting: ");
        for (int i: arr2){
            System.out.printf("%d ",i);
        }
        System.out.println("\n");

        //WRITE SHELLSORT



















    }
}
