interface IArithmeticsMult
{
    double Multiplication(double A,double B);
}

public class Main implements IArithmeticsMult{
    @Override
    public double Multiplication(double A, double B) {
        return A * B;
    }

    public static void main(String[] args) {
        System.out.println("MIVR, DevOps, romanbeznosenko");
        System.out.println("Andezion - Vlad");
        System.out.println("MichalColautti");
        System.out.println("Igor Frątczak");
    }
}
