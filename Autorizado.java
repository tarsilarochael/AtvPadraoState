public class Autorizado extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS autorizada não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS autorizada não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS autorizada não pode ser autorizada novamente"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS autorizada não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { 
        System.out.println("*** Autorizada --> EmExecucao"); 
        os.setState(new EmExecucao()); 
    }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS autorizada não pode ser finalizada"); }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS autorizada não pode ser colocada em teste"); }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS autorizada não pode ser aprovada"); }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS autorizada não pode ser paga"); }
}