public class Autorizado extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        atividade.setState(new EmExecucao());
    }

}