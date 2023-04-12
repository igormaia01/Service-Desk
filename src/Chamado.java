import java.time.LocalDateTime;
import java.util.List;

public class Chamado {
    private Cliente cliente;
    private String descricao;
    private String urgencia;
    private Atendente atendente;
    private LocalDateTime data;
    private LocalDateTime dataInteracao;

    private String situacao;
    private List<Equipamento> equipamentos;
    private Tecnico tecnico;
    private String solucao;
    private String categoria;

    // Construtor
    public Chamado(Cliente cliente, String descricao, String urgencia, Atendente atendente, LocalDateTime data, String situacao,
                   List<Equipamento> equipamentos, Tecnico tecnico, String solucao, String categoria) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.urgencia = urgencia;
        this.atendente = atendente;
        this.data = data;
        this.situacao = situacao;
        this.equipamentos = equipamentos;
        this.tecnico = tecnico;
        this.solucao = solucao;
        this.categoria = categoria;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEquipamentos() {
        String result = "Equipamentos: [";
        for (Equipamento equipamento : equipamentos) {
            result += equipamento.toString() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "]";
        return result;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void registrarInteracao(String descricao, LocalDateTime dataHora) {
        this.descricao = descricao;
        this.dataInteracao = dataHora;
    }

    public void definirSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void definirSolucao(String solucao) {
        this.solucao = solucao;
    }
}
