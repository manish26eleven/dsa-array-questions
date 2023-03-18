public class array9 {
    public static void main(String[] args) {
        int arr[]={5,9,8,6,7,4};
        int max;
        int j;
        for(int i=0;i<arr.length;i++) {
             max=arr[i];
            for( j=i+1;j<arr.length;j++) {
                
                if(arr[j]>max) {
                    break;
                }
            }
            if(j==arr.length) {
                System.out.println(max);
            }
        }
    }
}