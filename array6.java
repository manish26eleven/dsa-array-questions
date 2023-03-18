class recurr11 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,9};
        int i=0;
        int j=arr.length-1;
        for(i=0;i<arr.length/2;i++) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        } 
    
    for(int k=0;i<arr.length;k++) {
        System.out.println(arr[k]);
    }
}
}
