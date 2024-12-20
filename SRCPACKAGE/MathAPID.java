public class MathAPID {
    /**
     * Finds the harmonic aproximation 1+ 1/ap The more the ap is the closer to 2 it will go with a logarithmic curv
     * I think 
     * I think the limit is 2 as ap goes to infinity
     * it is not 1/ap+... it's 1 + 1/ap because the first term is 1/1
     * Remember that for doubles you have to have at least 1 double in the computation
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
}
