public class Paga extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS paga não pode ser colocada aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS paga não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS paga não pode ser autorizada"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS paga não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { System.out.println("OS paga não pode ser colocada em execução"); }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS paga não pode ser colocada finalizada"); }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS paga não pode ser colocada em teste"); }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS paga não pode ser aprovada novamente"); }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS paga não pode ser apaga novamente"); } 
}