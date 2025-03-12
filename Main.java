interface IArithmeticsDiff
{
    double Difference(double A, double B);
}

public class Main implements IArithmeticsDiff{
    double Difference(double A, double B)
    {
        return A - B;
    }

    public static void main(String[] args) {
        System.out.println("MIVR, DevOps, romanbeznosenko");
        System.out.println("Andezion - Vlad");
        System.out.println("MichalColautti");
        System.out.println("Igor Frątczak");
    }
}
