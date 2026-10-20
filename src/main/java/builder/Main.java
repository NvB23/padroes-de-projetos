package builder;

public class Main {
    public static void main(String[] args) {
        ComputadorNormal computadorNormal = new ComputadorNormal(
                "CDJKFH",
                Computador.TipoMemoria.HDD,
                "DAHJ JRH",
                "FONT HDSJ",
                "FHS JGG",
                "HJSG HFSDJ",
                "DJHG FHSDJ"
        );

        ComputadorGamer computadorGamer = new ComputadorGamer(
                "HFSKHGKD",
                Computador.TipoMemoria.SDD,
                "DJH YYUU",
                "GYEFU YRWIU",
                "FDSDH HSGH",
                "SHKJSGD HFDJKS",
                "FSH FHHGJJH"
        );

        System.out.println(computadorNormal);
        System.out.println(computadorGamer);
    }
}
