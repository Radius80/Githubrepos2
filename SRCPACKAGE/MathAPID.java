public class MathAPID {
    /**
     * Finds the harmonic aproximation 1+ 1/ap The more the ap is the closer to 2 it will go with a logarithmic curv
     * I think 
     * I think the limit is 2 as ap goes to infinity
     * it is not 1/ap+... it's 1 + 1/ap because the first term is 1/1
     * Remember that for doubles you have to have at least 1 double in the computation
     * @param ap The aproxamation degree
     * @return Aproximated sum
     */
    public static double FindHarmonicAprox(int ap)
    {
        double sum = 0.0;
        for(int i = 1; i <= ap; i++)
        {
            sum += 1.0/i;
        }
        return sum;
    }
    public static double H(int N)
    {
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        return sum;
    }
    /**
     * Returns the abselute value of an integer
     * @param intt the intger without the abselute function on it
     * @return The abselute value of the integer
     */
    public static int Abselute(int intt)
    {
        if( intt < 0)
            return -1*intt;
        else
            return intt;
    }
    /**
     * Checks if a integer is a prime
     * First checks if the number is the parameter is less than 2. Remember that negative numbers is not prime. Prime numbers only have two factors. let's take -3. -3's factors are 1,-1,3,-3. There are 4. -1 != 1 and  -3 != 3
     * @param pi Interger to be checked
     * @return either true if the integer parameter is a prime number or false if the integer is not a prime
     */
    public static boolean isPrime(int pi)
    {
        boolean iPrim = false;
        int div = pi;
        if(div < 2 ){
           iPrim = false;
            }
        else{
            iPrim = true;
            while(div > 2){
                div--;
                if(pi % div == 0){
                    iPrim = false;
                    break;}
                }
            }
        return iPrim;
    }

}
