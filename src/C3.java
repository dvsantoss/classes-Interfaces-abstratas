public class C3 extends C1 implements I1, I2 {
    private int codigo; // atributo proprio de c3

    // construtor padrao
    public C3() {
        this.codigo = 0; // inicializa com valor padrao
    }

    // construtor com parametro (sobrecarga de construtor)
    public C3(int codigo) {
        this.codigo = codigo; // inicializa com valor passado
    }

    // construtor com nome e codigo (sobrecarga de construtor)
    public C3(String nome, int codigo) {
        setNome(nome); // chama metodo da classe pai
        this.codigo = codigo; // inicializa codigo
    }

    @Override
    public void metodoProprioC1() {
        System.out.println("Método próprio herdado de C1 em C3"); // toda classe que herda de c1 deve implementar esse metodo
                                                           // abstrato
    }

    @Override
    public void metodo_I1_A() {
        System.out.println("Metodo_I1_A da interface I1 em C3"); // implementação do metodo da interface I1
    }

    @Override
    public void metodo_I2_A() {
        System.out.println("Metodo_I2_A da interface I2 em C3"); // implementação do metodo da interface I2
    }

    @Override
    public void metodo_I2_B() {
        System.out.println("Metodo_I2_B da interface I2 em C3"); // implementação do metodo da interface I2
    }



    public void metodoProprioC3() {
        System.out.println("Método Proprio da classe C3"); // metodo proprio de c3
    }

    // sobrecarga do metodo metodoProprioC3 com um parametro
    public void metodoProprioC3(String mensagem) {
        System.out.println("Método Proprio da classe C3: " + mensagem); // metodo proprio de c3 com mensagem personalizada
    }

    // sobrecarga do metodo metodoProprioC3 com dois parametros
    public void metodoProprioC3(String mensagem, int numero) {
        System.out.println("Método Proprio da classe C3: " + mensagem + " - Numero: " + numero); // metodo proprio de c3 com mensagem e numero
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
