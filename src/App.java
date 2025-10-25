public class App {
    public static void main(String[] args) {
                
        // sobre a classe C1 nao e possivel instanciar diretamente por ser abstrata
        // C1 serve como base para as outras classes

        // testando C2
        System.out.println("\n+++ Testando classe C2 +++");

        C2 objC2 = new C2();

        objC2.setNome("objeto C2"); // vem de C1
        objC2.setValor(100); // proprio de C2

        System.out.println("Nome: " + objC2.getNome());
        System.out.println("Valor: " + objC2.getValor());

        objC2.metodoProprioC1();
        objC2.metodoProprioC2();
        
        // testando C3
        System.out.println("\n+++ Testando classe C3 +++");

        // testando sobrecarga de construtores
        System.out.println("\n+++ Testando sobrecarga de construtores +++");
        
        C3 objC3_1 = new C3(); // construtor padrao
        System.out.println("Construtor padrao - Codigo: " + objC3_1.getCodigo());
        
        C3 objC3_2 = new C3(200); // construtor com codigo
        System.out.println("Construtor com codigo - Codigo: " + objC3_2.getCodigo());
        
        C3 objC3_3 = new C3("objeto C3", 300); // construtor com nome e codigo
        System.out.println("Construtor com nome e codigo - Nome: " + objC3_3.getNome() + ", Codigo: " + objC3_3.getCodigo());

        // testando sobrecarga de metodos
        System.out.println("\n+++ Testando sobrecarga de metodos +++");
        
        objC3_3.metodoProprioC1();
        
        objC3_3.metodoProprioC3(); // metodo sem parametros
        objC3_3.metodoProprioC3("Mensagem personalizada"); // metodo com 1 parametro
        objC3_3.metodoProprioC3("Mensagem com numero", 42); // metodo com 2 parametros

        objC3_3.metodo_I1_A();
        objC3_3.metodo_I2_A();
        objC3_3.metodo_I2_B();
        
        // testando C4
        System.out.println("\n+++ Testando classe C4 +++");

        C4 objC4 = new C4();

        objC4.setNome("objeto C4"); // vem de C1 pq c4 extende c2 que extende c1
        objC4.setValor(300); // vem de C2
        objC4.setAtivo(true); // proprio de C4

        System.out.println("Nome: " + objC4.getNome());
        System.out.println("Valor: " + objC4.getValor());
        System.out.println("Ativo: " + objC4.isAtivo());

        objC4.metodoProprioC1();
        objC4.metodoProprioC2();
        objC4.metodoProprioC4();
        
        // testando C5
        System.out.println("\n+++ Testando classe C5 +++");

        C5 objC5 = new C5();

        objC5.setNome("objeto C5"); // vem de C1 pq c5 extende c2 que extende c1
        objC5.setValor(400); // vem de C2
        objC5.setPreco(99.99);  // proprio de C5

        System.out.println("Nome: " + objC5.getNome());
        System.out.println("Valor: " + objC5.getValor());
        System.out.println("Preço: " + objC5.getPreco());

        objC5.metodoProprioC1(); // de C1
        objC5.metodoProprioC2(); // de C2
        objC5.metodoProprioC5(); // de C5
        objC5.metodo_I1_A(); // de I1
    }
}