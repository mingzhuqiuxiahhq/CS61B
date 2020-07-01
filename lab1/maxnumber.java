public class maxnumber {

    /**
     * Returns the maximum value from m.
     */
    public static int max(int[] m) {
        int max = m[0];
        if (max < m[1]) max = m[1];
        if (max < m[2]) max = m[2];
        if (max < m[3]) max = m[3];
        if (max < m[4]) max = m[4];
        if (max < m[5]) max = m[5];
        if (max < m[6]) max = m[6];
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }

}
