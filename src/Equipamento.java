public class Equipamento {
    private String nome;
    private String ano;
    private String modelo;

    public Equipamento(String nome, String ano, String modelo) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Equipamento: Nome=" + this.nome + ", Ano=" + this.ano + ", Modelo=" + this.modelo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
