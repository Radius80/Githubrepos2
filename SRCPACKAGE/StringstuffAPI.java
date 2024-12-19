public class StringstuffAPI {


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
     * Converts a integer to binary and displayes it as a string
     * @param N: Int to be desplayed as binary string
     * @return: String representing binary version of int
     * @implNote: I couldn't remember if integer division rounds up or down so I tested that out first ANSWER:::: It rounds down
     * @implNote: I will use the mod to see if 
     * @implNote: "/=" means i = i /2
     * @implNote: It's flipped around it prints 1 when it's not a multiple of 2 and 0 when it is it works for some reason
     * @implNote: It's because mod is on when it's not a multiple
     */
    public static String IntegerTOOBinary(int N)
    {
        String s = "";
        for (int i = N ; i > 0 ; i /= 2)
        {
            s = (i % 2) + s;
        }
        return s;
    }

}
