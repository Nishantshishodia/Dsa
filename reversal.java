public class reversal {
public static void main(String[] args) {
    int[]array={1,2,3,5,8,10};
    int n= array.length;
    for(int i=0;i<n/2;i++){
        //swaping of the elements aaray[i]=array[n-i-1]
        int temp= array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
    }
    System.out.println("Reversal of an Array is:");
    for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
}
}
