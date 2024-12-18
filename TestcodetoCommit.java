
public class TestcodetoCommit {
   
    public static void main(String[] args) throws Exception {
        // initializing declaration of a 2D array
        // if the class you are using in your client is in the same package you do not have to have to import anything
        StringstuffAPI ssapi = new StringstuffAPI(); // This is making an object out of a class. I wanted to call it an ADT but Abtract Data Types usually has instance variables
        ArrayFunctions AFff = new ArrayFunctions();
        
        double [][] ar1 = {{1,2,3},{3,4,5},{1,2,3}};
        double [][] ar2 = {{2,2,2},{1,1,1},{2,2,2}};
        double [][] mult = AFff.matrixMult(ar1, ar2, ar1[0].length);
        System.out.print(ssapi.LIST2DARRAY(mult));
        System.out.println(ssapi.IntegerTOOBinary(8));
    }

    
 


}
