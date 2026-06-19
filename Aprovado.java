public class Aprovado extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        atividade.setState(new Paga());
    }
}