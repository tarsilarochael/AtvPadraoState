public class Diagnostico extends Estado {
    public void mudaEstado(OrdemServico atividade) {
        if(atividade.getState() == 0) {
            atividade.setState(new Autorizado());
        }else{
            atividade.setState(new Cancelada());
        }
    }
}