public class EmExecucao extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        atividade.setState(new Finalizado());
    }
}