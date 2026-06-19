public class EmExecucao extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS em execucao não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS em execução não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS em execução não pode ser autorizada"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS em execução não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { System.out.println("OS em execução não pode ser colocada em execução novamente"); }
    @Override
    public void finalizar(OrdemServico os) { 
        System.out.println("*** EmExecucao --> Finalizada"); 
        os.setState(new Finalizado()); 
    }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS em execução não pode ser colocada em teste"); }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS em execução não pode ser aprovada"); }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS em execução não pode ser paga"); }
}