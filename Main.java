
interface IAritmeticsDiv{
    double Division(double A, double B);
}



public class Main implements IAritmeticsDiv {
    @override
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
