public class TestcodetoCommit {

    public static void main(String[] args) throws Exception {
        // initializing declaration of a 2D array
        double [][] ar1 = {{1,2,3},{3,4,5},{1,2,3}};
        double [][] ar2 = {{2,2,2},{1,1,1},{2,2,2}};
        double [][] mult = matrixMult(ar1, ar2, ar1[0].length);
        System.out.print(LIST2DARRAY(mult));
    }

    /**Print contents of 2D array
    * @param arr - 2D array of which contents need to be printed
    * @return String of list of contents of array
    */
    public static String LIST2DARRAY(double[][] arr)
    {
        String contents = "";
        for (int i = 0; i < arr.length; i ++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                contents = contents + arr[i][j] + " ";
            }
            contents = contents+ "\n";
        }
        return contents;
    }

    /**
     * Will 2 square matrices of real values
     * @implNote I wanted to just print something to work of, and found Sytem.arraycopy or something
     * @param ar1 : first double square matrix
     * @param ar2 : second double square matrix
     * @param l: Length of array
     * @return resultand matrix
     * 
     */
    public static double[][] matrixMult(double ar1[][], double ar2[][], int l)
    {
        double [][] ret = new double [l][l];
        System.arraycopy(ar1,0,ret,0,l);

        return ret;
    }
}
