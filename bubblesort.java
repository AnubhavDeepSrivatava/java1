public class bubblesort {
    public static void main(String[] args) {
        int a[]={1,4,3,7,2,4,7,4,8,2,9,10,2,5};
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }//tdsgsghshshtr
    
}
