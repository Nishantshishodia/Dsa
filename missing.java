public class missing {
public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
        int n= array.length;
        //sum of natural number of an elements
        int sum_natural_numbers=((n+1)*(n+2))/2;
        // sum of given elements of an array
        int sum=0;
        for(int i=0;i<n;i++){
            sum += array[i];
        }
         int missing_element=0;
        missing_element= sum_natural_numbers-sum;
        System.out.println("The misssing element of an array is:"+ missing_element);
    }
}
