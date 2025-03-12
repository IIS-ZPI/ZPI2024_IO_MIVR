interface IArithmeticsAdd
{
    double Addition(double A, double B);
}

public class Main implements IArithmeticsAdd
{
    double Addition(double A, double B)
    {
        return A + B;
    }

    public static void main(String[] args) 
    {
        System.out.println("MIVR, DevOps, romanbeznosenko");
        System.out.println("Andezion - Vlad");
    }
}
