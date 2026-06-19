public class Aprovado extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS aprovada não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS aprovada não pode ser colocada em diagnóstico"); }
    @Override
    public void autorizar(OrdemServico os) { System.out.println("OS aprovada não pode ser autorizada"); }
    @Override
    public void cancelar(OrdemServico os) { System.out.println("OS aprovada não pode ser cancelada"); }
    @Override
    public void executar(OrdemServico os) { System.out.println("OS aprovada não pode ser colocada em execução"); }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS aprovada não pode ser colocada finalizada"); }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS aprovada não pode ser colocada em teste"); }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS aprovada não pode ser aprovada novamente"); }
    @Override
    public void pagar(OrdemServico os) { 
        System.out.println("*** Aprovada --> Paga"); 
        os.setState(new Paga()); // Certifica-te de que o ficheiro se chama Paga.java!
    }
}