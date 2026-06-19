public class EmTeste extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS em teste não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS em teste não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS em teste não pode ser autorizada"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS em teste não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { 
        System.out.println("*** EmTeste --> EmExecucao"); 
        os.setState(new EmExecucao()); 
    }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS em teste não pode ser colocada finalizada"); }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS em teste não pode ser colocada em teste novamente"); }
    @Override
    public void aprovar(OrdemServico os) { 
        System.out.println("*** EmTeste --> Aprovada"); 
        os.setState(new Aprovado()); 
    }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS em teste não pode ser paga"); }
}