public class C2 extends C1 {
    private int valor; // atributo proprio de c2

    @Override
    public void metodoProprioC1() {
        System.out.println("Implementação do método próprio herdado de C1"); // toda classe que herda de c1 deve implementar esse metodo abstrato
    }

    public void metodoProprioC2() {
        System.out.println("Método próprio da classe C2");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
