public class Aberto extends Estado() {
    @Override
    public void mudaEstado(OrdemServico atividade) {
        if(atividade.getState() == 0) {
            atividade.setState(new Autorizado());
        } else if(atividade.getState() == 1) {
            atividade.setState(new Dignostico());
        }else{
            atividade.setState(new Cancelada());
        }
    }
}



