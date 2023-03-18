//print bar chart for array {2,0,1,3,5,6,7}
public class array4 {
    public static void main(String[] args) {
    int arr[]={2,0,1,3,5,6,7};
    int max=arr[0];
    for(int i=1;i<arr.length;i++) {
        if(arr[i]>max) {
            max=arr[i];
        }

    }
    char barchart[][] = new char[max][arr.length];
    for(int i=0;i<arr.length;i++) {
        for(int j=0;j<max-arr[i];j++) {
            barchart[j][i] = ' ';

        }
        for(int k=0;k<arr[i];k++) {
            barchart[max-arr[i]+k][i] = '*';
        }
    }
    for(int i=0;i<max;i++) {
        for(int j=0;j<arr.length;j++) {
            System.out.print(barchart[i][j]);
        }
        System.out.println();
    }

}
}
