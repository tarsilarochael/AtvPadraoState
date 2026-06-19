public class Finalizado extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        atividade.setState(new EmTeste());
    }
}