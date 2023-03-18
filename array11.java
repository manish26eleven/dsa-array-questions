public class array11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int t=8;
        int k=t%7;
        int array[] = new int[arr.length];
        for(int i=0;i<k;i++) {
           array[i]=arr[arr.length-k+i]; 
        }
        for(int i=0;i<arr.length-k;i++) {
            array[k+i]=arr[i];
        }
        System.out.print("{ ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" , ");
        }
        System.out.println(" }");
    }
}
