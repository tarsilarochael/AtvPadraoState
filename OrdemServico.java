public class OrdemServico {
    public int estado;
    public String descricao;

    public OrdemServico(String descricao) {
        this.descricao = descricao;
        this.estado = new Aberto();
    }

    public void preAprovado() {
        estado.preAprovado(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void setState(AtividadeState newState) {
        this.estado = newState;
    }

    public String getState() {
        return int estado;
    }
}
