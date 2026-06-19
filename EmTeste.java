public class EmTeste extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        if(atividade.getState() == 0) {
            atividade.setState(new EmExecucao());
        }else{
            atividade.setState(new Aprovado());
        }
    }
}