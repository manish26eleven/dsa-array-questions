public class arr14 {
    public static void main(String[] args) {
        int arr[]= {0,1,0,0,1,1,0,0,0,1,1};
        int ARR[]= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                ARR[j]=0;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) {
                ARR[j]=1;
                j++;
            }
        }
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(ARR[i]+" , ");
        }
        System.out.println("}");
    }
}
