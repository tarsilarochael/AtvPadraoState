public class Diagnostico extends Estado {
    @Override
    public void abrir(OrdemServico os) { System.out.println("OS em diagnóstico não pode ser aberta"); }
    @Override
    public void diagnosticar(OrdemServico os) { System.out.println("OS em dignostico não pode ser colocada em diagnóstico novamente"); }
    @Override
    public void autorizar(OrdemServico os) { 
        System.out.println("*** Diagnóstico --> Autorizada"); 
        os.setState(new Autorizado()); 
    }
    @Override
    public void cancelar(OrdemServico os) { 
        System.out.println("*** Diagnóstico --> Cancelada"); 
        os.setState(new Cancelado()); 
    }
    @Override
    public void executar(OrdemServico os) { System.out.println("OS em diagnóstico nao pode ser colocada em execução"); }
    @Override
    public void finalizar(OrdemServico os) { System.out.println("OS em diagnóstico não ser finalizada"); }
    @Override
    public void testar(OrdemServico os) { System.out.println("OS em diagnóstico não pode ser colocada em teste"); }
    @Override
    public void aprovar(OrdemServico os) { System.out.println("OS em diagnóstico não pode ser aprovada"); }
    @Override
    public void pagar(OrdemServico os) { System.out.println("OS em diagnóstico não pode ser paga"); }
}