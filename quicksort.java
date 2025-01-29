public class quicksort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        qs(arr, 0, arr.length - 1);
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }   
    
    public static void qs(int arr[], int st, int end) {
        if (st < end) {  
            int pvt = partition(arr, st, end);
            qs(arr, st, pvt - 1);
            qs(arr, pvt + 1, end);
        }
    }

    public static int partition(int arr[], int st, int end) {
        int pivot = arr[end];  
        int idx = (st - 1);  
        
        for (int j = st; j < end; j++) {  
            if (arr[j] < pivot) {
                idx++;
                swap(arr, idx, j);
            }
        }
        idx++;
        swap(arr, idx, end);  

        return idx;  
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
