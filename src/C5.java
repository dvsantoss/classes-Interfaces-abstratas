public class C5 extends C2 implements I1 {
    private double preco; // atributo proprio de c5

    @Override
    public void metodo_I1_A() {
        System.out.println("metodo_I1_A da interface I1 em C5"); // implementação do metodo da interface I1
    }

    public void metodoProprioC5() {
        System.out.println("Método Proprio da classe C5"); // metodo proprio de c5
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
