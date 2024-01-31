public class ArrayOps {
    public static void main(String [] args) {





    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int n = array.length ;
        int a = 0 ;
        for (int i = 0 ; i <= n  ; i++) {
            boolean missing = false;
            for (int j = 0; j < n; j++) {
                if (i == array[j]) {
                    missing = true;
                    break;
                }
            }
            if (!missing) {
                a = i;
                break;
            }
        }


        return a;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int n = array.length ;

        if(n<2)return -1;

        int biggest = array[0];
        int second = array[0];

        for (int i = 0 ; i < n ; i ++) {

            if (biggest < array[i]){
                second = biggest;
                biggest = array[i];
           }
             else if (second<array[i] && array[i]!=biggest) second = array[i] ;
        }

        return second;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
