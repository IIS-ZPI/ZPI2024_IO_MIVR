interface IArithmeticsAdd
{
    double Addition(double A, double B);
}

interface IArithmeticsDiff
{
    double Difference(double A, double B);
}

public class Main implements IArithmeticsAdd, IArithmeticsDiff
{
    double Addition(double A, double B)
    {
        return A + B;
    }

    double Difference(double A, double B)
    {
        return A - B;
    }

    public static void main(String[] args) 
    {
        System.out.println("MIVR, DevOps, romanbeznosenko");
        System.out.println("Andezion - Vlad");
        System.out.println("MichalColautti");
        System.out.println("Igor Frątczak");
    }
}
