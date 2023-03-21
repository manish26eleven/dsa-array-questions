public class arr16 {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,2,2,1,0,1,0,2,2};
        int ARR[]= new int[arr.length];
        ARR[0]=arr[0];
        for(int i=1;i<arr.length;i++) {
            ARR[i]=arr[i]+ARR[i-1];
        }
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(ARR[i]+" ,");
        }    
        System.out.println("}");
}
}
