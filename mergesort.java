import java.util.ArrayList;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        mergesplit(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void mergesplit(int arr[],int st,int end)

    {
        if(st<end)
        {
            int mid=(st+end)/2;
            mergesplit(arr,st,mid);
            mergesplit(arr,mid+1, end);
            merge(arr,st,mid,end);
        }
    }

        public static void merge(int arr[],int st,int mid,int end)
        {
         

           ArrayList<Integer> temp = new ArrayList<>();
           int i=st;
           int j=mid+1;
           while (i<=mid && j<=end) {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
           }
           while(i<=mid)
           {
            temp.add(arr[i]);
            i++;
           }
           while(j<=end)
           {
            temp.add(arr[j]);
            j++;
           }
           for (int j2 = 0; j2 < temp.size(); j2++) {
            arr[st+j2]=temp.get(j2);
           }

         }

}
    

