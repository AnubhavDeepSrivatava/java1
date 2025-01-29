public class selectionsort {
    public static void main(String[] args) {
        int a[]={1,4,3,7,2,4,7,4,8,2,9,10,2,5};
        int c=0;
        for (int i = 0; i < a.length; i++) {
            int smallindx=i;
            
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[smallindx])
                {
                    smallindx=j;
                }
                c=a[i];
                a[i]=a[smallindx];
                a[smallindx]=c;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
