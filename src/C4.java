public class C4 extends C2 {
    private boolean ativo; // atributo proprio de c4
    
    public void metodoProprioC4() {
        System.out.println("Método Proprio da classe C4"); // metodo proprio de c4
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
