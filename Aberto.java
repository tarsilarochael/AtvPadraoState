public class Aberto extends Estado {
    
    @Override
    public void abrir(OrdemServico os) {
        System.out.println("OS aberta não pode ser colocada como aberta novamente"); // [cite: 67]
    }

    @Override
    public void diagnosticar(OrdemServico os) {
        System.out.println("*** Aberta --> Diagnóstico"); // [cite: 68]
        os.setState(new Diagnostico());
    }

    @Override
    public void autorizar(OrdemServico os) {
        System.out.println("*** Aberta --> Autorizada"); // [cite: 69]
        os.setState(new Autorizado());
    }

    @Override
    public void cancelar(OrdemServico os) {
        System.out.println("*** Aberta --> Cancelada"); // [cite: 70]
        os.setState(new Cancelado());
    }

    @Override
    public void executar(OrdemServico os) {
        System.out.println("OS aberta nao pode ser colocada em execução"); // [cite: 71]
    }

    @Override
    public void finalizar(OrdemServico os) {
        System.out.println("OS aberta não ser finalizada"); // [cite: 72]
    }

    @Override
    public void testar(OrdemServico os) {
        System.out.println("OS aberta não pode ser colocada em teste"); // [cite: 73]
    }

    @Override
    public void aprovar(OrdemServico os) {
        System.out.println("OS aberta não pode ser aprovada"); // [cite: 74]
    }

    @Override
    public void pagar(OrdemServico os) {
        System.out.println("OS aberta não pode ser paga"); // [cite: 75]
    }
}