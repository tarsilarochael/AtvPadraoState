public class Finalizado extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS finalizada não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS finalizada não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS finalizada não pode ser autorizada"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS finalizada não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { System.out.println("OS finalizada não pode ser colocada em execução"); }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS finalizada não pode ser finalizada novamente"); }
    @Override
    public void testar(OrdemServico os) { 
        System.out.println("*** Finalizada --> EmTeste"); 
        os.setState(new EmTeste()); 
    }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS finalizada não pode ser aprovada"); }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS finalizada não pode ser paga"); }
}