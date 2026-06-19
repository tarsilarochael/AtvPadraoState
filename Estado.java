public abstract class Estado {
    public void abrir(OrdemServico os) {}
    public void diagnosticar(OrdemServico os) {}
    public void autorizar(OrdemServico os) {}
    public void cancelar(OrdemServico os) {}
    public void executar(OrdemServico os) {}
    public void finalizar(OrdemServico os) {}
    public void testar(OrdemServico os) {}
    public void aprovar(OrdemServico os) {}
    public void pagar(OrdemServico os) {}
}