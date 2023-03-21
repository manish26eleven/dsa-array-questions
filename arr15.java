public class arr15 {
    public static void main(String[] args) {
        int arr[]= {0,1,1,1,0,0,2,2,1,0,1,0,2,2};
        int ARR[]= new int[arr.length];
        int k=0;
        for(int j=0;j<3;j++) {
            for(int i=0;i<arr.length;i++)
            if(arr[i]==j) {
                ARR[k]=j;
                k++;
            }
        }
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(ARR[i]+" , ");
        }
        System.out.println("}");
    }
}
