package lab0;

public class Variant8 {



    /**
     *
     * @param k is a two-digit number
     * @return swapped digits of k
     */

    public static int integerNumbersTask(int k) {
            if ((10 > Math.abs(k)) || (Math.abs(k) > 99))
                throw new IllegalArgumentException("Number has to be between 10 and 99");

            int result;

            result = Math.abs(k/ 10)+Math.abs(k % 10*10);

            return result;
    }

    /**
     * @param A is integer number
     * @param B is integer number
     * @return true, if number1 and number2 are odd
     */
    public boolean booleanTask(int A, int B) {

        return (A%2!=0)&&(B%2!=0);

    }


    /**
     * @param k1 is a double
     * @param k2 is a double
     * @return max number, then min number
     */
    public double[] ifTask(double k1, double k2) {
        double min,max;
        if(k1>k2) {
            max = k1;
            min = k2;
        }  else {
            max= k2;
            min= k1;
        }
        return new double[]{max,min};
    }


    /**
     *
     * @param D is an integer number
     * @param M is an integer number
     * @return the date before the given one
     */
    public double[] caseTask(int D, int M){

        switch(D) {

            case 1:
                switch (M) {
                    case 1 -> {
                        D = 31;
                        M = 12;
                    }
                    case 2, 4, 6, 8, 9, 11 -> {
                        D = 31;
                        M = M - 1;
                    }
                    case 3 -> {
                        D = 28;
                        M = M - 1;
                    }
                    case 5, 7, 10, 12 -> {
                        D = 30;
                        M = M - 1;
                    }
                }
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                D = D - 1;
                break;

         }
    return new double[]{D,M};
    }




    /**
     *
     * @param A is integer number
     * @param B is integer number
     * @return multiplication of all numbers from A to B inclusively
     */
    public double forTask(int A, int B) {
        assert A < B: "B should be greater than A";
        int result=1;
        for(int i = A; i<=B; i++)
        {
            result*=i;
        }
        return result;
    }

    /**
     *
     * @param N is integer number
     * @return find K, whose square is not greater than N
     */
    public int whileTask(int N) {
        assert (N >0): "Argument should be more than zero";
        int i=0;
        while((i+1)*(i+1)<= N) {
            ++i;
        }
        return i;
    }
    /**
     *
     * @param array is
     * @param N is an integer
     * @return all the odd numbers in an increasing order, and their quantity
     */
    public int[] arrayTask(int N, int[] array) {
        int[] arr = new int[N];
        int K=0;
        for(int i=0; i<N; i++) {
            if (arr[i] % 2 != 0) {
                K++;
            }
        }
        int[] arr1 = new int[K];
        int index=0;
        for(int i=0; i<N; i++)
        {
              if(arr[i]%2!=0){
                arr1[index++]=arr[i];
              }

        }
        int temp;
        for (int i = 0; i <K; i++) {
            for (int j = i+1; j <K; j++) {
                if(arr1[i] >arr1[j]) {      //swap elements if not in order
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return arr1;
    }



    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}
