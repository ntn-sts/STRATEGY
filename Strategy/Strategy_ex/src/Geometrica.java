public class Geometrica implements ICalcMedia{

    @Override
    public double CalculaMedia(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String Situacao(double media) {
        if (media > 7)
            return "APROVADO!";
        else
            return "REPROVADO!";
    }
}
