/*
 * 1 3 5 7 11 13 17
 */

public class TestcodetoCommit {
   //This client tests arrayFunctions and StringstuffAPI
    public static void main(String[] args) throws Exception {
        // initializing declaration of a 2D array
        // if the class you are using in your client is in the same package you do not have to have to import anything
       
        StringstuffAPI ssapi = new StringstuffAPI(); // This is making an object out of a class. I wanted to call it an ADT but Abtract Data Types usually has instance variables
        ArrayFunctions AFff = new ArrayFunctions();
        SearchingAPI srchapi = new SearchingAPI(); // use these objects to find the code that you are looking for srch is for search
        //String [] argsVSpoop = {"1", "3", "5", "7","11","13", "17"}; //COMMENT OUT THIS LINE AND FIND AND REPLACE argsVSpoop with args when testing in command line. So I'm using VScode debugging tools and it does not understand argument values
        //double [][] ar1 = {{1,2,3},{3,4,5},{1,2,3}}; //Initializing declaration
        //double [][] ar2 = {{2,2,2},{1,1,1},{2,2,2}};
        int [] iarr1 = new int [args.length];
        for(int i = 0; i < args.length; i++)
        {
            iarr1[i] = Integer.parseInt(args[i]);
        }
        //double [][] mult = AFff.matrixMult(ar1, ar2, ar1[0].length);
        //System.out.print(ssapi.LIST2DARRAY(mult));
        //System.out.println(ssapi.IntegerTOOBinary(8));
        System.out.println(srchapi.indexOf(iarr1, 7));

        
    }

    
 


}
