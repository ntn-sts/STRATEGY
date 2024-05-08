public class Main {
    public static void main(String[] args) {

        Aritmetica calc = new Aritmetica();

        Disciplina d = new Disciplina(calc);

        d.setNome("COBOL");
        d.setP1(7); d.setP2(4);
        d.CalculaMedia();
        d.setSituacao(d.Situacao());
        System.out.println(
                String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",
                        d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()));
    }
}
