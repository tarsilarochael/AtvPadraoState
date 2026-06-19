public class OrdemServico {
    private Estado estado;
    public String descricao;

    public OrdemServico(String descricao) {
        this.descricao = descricao;
        // Quando a OS nasce, ela começa no estado Aberto
        this.estado = new Aberto(); 
    }

    public void setState(Estado newState) {
        this.estado = newState;
    }

    // Repassando as chamadas para o estado atual:
    public void abrir() { estado.abrir(this); }
    public void diagnosticar() { estado.diagnosticar(this); }
    public void autorizar() { estado.autorizar(this); }
    public void cancelar() { estado.cancelar(this); }
    public void executar() { estado.executar(this); }
    public void finalizar() { estado.finalizar(this); }
    public void testar() { estado.testar(this); }
    public void aprovar() { estado.aprovar(this); }
    public void pagar() { estado.pagar(this); }
}