public class insertionsort {
   public static void main(String[] args) {
    int a[]={1,4,3,7,2,4,7,4,8,2,9,10,2,5};
    int curr=0;
    int prev=0;
    for(int i=1;i<a.length;i++)
    {
        curr=i;
        prev=i-1;
        while (prev>=0 && a[prev]>curr) {
            a[prev+1]=a[prev];
            prev--;
        }
        a[prev+1]=curr;
    }
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
   } 
}
