public class Calculadora {
    private IOperacao oper;

    //GetOper
    public IOperacao getOper() {
        return oper;
    }

    //SetOper
    public void setOper(IOperacao oper) {
        this.oper = oper;
    }

    private int A;
    private int B;

    public Calculadora(IOperacao oper) { //alt + insert -> atalho para criar construtor
        this.oper = oper;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    int Calculo() {
        return oper.Operacao(this.A, this.B);
    }

}