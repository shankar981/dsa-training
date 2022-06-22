import java.util.Scanner;

class majorityElement {
    public static int majorityElement(int nums[]) {
        int majorityElement = 0;
        int count = 0;

        for (int element : nums) {
            if (count == 0) {
                majorityElement = element;
            }
            if (element == majorityElement) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return majorityElement;

    }

    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner ( System.in ) ;
        System.out.println ( " Enter number of elements :  " ) ;
        n = sc.nextInt() ;
        int [] array = new int[ n ] ;
        System.out.println ( " Enter elements of the array :  " ) ;
        for ( int i = 0 ; i < n ; i++ )
        {
            array[ i ] = sc.nextInt() ;
        }

     System.out.println("majority element is : " + majorityElement(array));
    }
}
