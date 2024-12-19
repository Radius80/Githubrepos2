public class ArrayFunctions {
    /**
     * Will 2 square matrices of real values
     * @implNote I wanted to just print something to work of, and found Sytem.arraycopy or something
     *  @implNote So the API of System.arraycopy is (first array, position to start copy from, second array to copy too, position to copy too , Length)
     * @implNote So the strategy is a three times nested loop that using variables that stay the same and change to get the effect
     * @param ar1 : first double square matrix
     * @param ar2 : second double square matrix
     * @param l: Length of array
     * @return resultand matrix
     * 
     */
    public static double[][] matrixMult(double ar1[][], double ar2[][], int l)
    {
        double [][] ret = new double [l][l];
        //System.arraycopy(ar1,0,ret,0,l);
        for(int i = 0; i < l; i++)
        {
            for (int j = 0; j < l; j ++)
            {
                for (int k = 0; k < l; k ++)
                {
                    //You struggled with this. I think you'll get it if you concider that k changes the most j changes less than k but more than i
                    ret[i][j] += ar1[i][k]*ar2[k][j];
                }
            }
        }
        return ret;
    }
    
}
