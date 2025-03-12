
interface IAritmeticsDiv{
    double Division(double A, double B);
}


interface IArithmeticsDiff
{
    double Difference(double A, double B);
}

interface IArithmeticsMult
{
    double Multiplication(double A,double B);
}

public class Main implements IArithmeticsDiff, IArithmeticsMult,IAritmeticsDiv {
    @Override
    public double Difference(double A, double B)
    {
        return A - B;
    }

    @Override
    public double Multiplication(double A, double B) {
        return A * B;
    }
    @Override
    public static double Division(double A, double B){
        if (B == 0) return 0;
        return A/B;
    }

    public static void main(String[] args) {
        System.out.println("MIVR, DevOps, romanbeznosenko");
        System.out.println("Andezion - Vlad");
        System.out.println("MichalColautti");
        System.out.println("Igor Frątczak");
    }
}
