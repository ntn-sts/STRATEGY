public class Disciplina {

    private ICalcMedia CalcMedia;
    double Media;
    private String Nome;
    private double p1;
    private double p2;
    String Situacao;

    //CONSTRUTOR
    public Disciplina(ICalcMedia calcMedia) {
        this.CalcMedia = calcMedia;
    }

    //MÉTODOS
    void  CalculaMedia()
    {
        this.Media = CalcMedia.CalculaMedia(this.p1, this.p2);
    }

    String Situacao()
    {
        return CalcMedia.Situacao(this.Media);
    }

    //SETTER AND GETTERS (CalcMedia, Media, Nome, p1, p2, Situacao)
    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }
}
