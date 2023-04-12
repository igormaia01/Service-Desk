import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João Silva", "123.456.789-00");

        Atendente atendente = new Atendente(1, "Maria Souza", "987.654.321-00");

        Tecnico tecnico = new Tecnico(1, "Carlos Oliveira", "111.222.333-44");

        Equipamento equipamento = new Equipamento("Notebook", "2022", "Dell XPS 13");

        Chamado chamado = new Chamado(cliente, "Problema na tela do notebook", "Alta", atendente,
                LocalDateTime.now(), "Aberto", Arrays.asList(equipamento), tecnico, null, "Hardware");

        chamado.registrarInteracao("O técnico realizou uma verificação de rotina.", LocalDateTime.of(2023, 4, 11, 15, 30));

        chamado.definirSituacao("Resolvido");
        chamado.definirSolucao("Substituição do cabo flat da tela");

        System.out.println("Detalhes do chamado:");
        System.out.println("Cliente: " + chamado.getCliente().getNome());
        System.out.println("Descrição: " + chamado.getDescricao());
        System.out.println("Urgência: " + chamado.getUrgencia());
        System.out.println("Atendente: " + chamado.getAtendente().getNome());
        System.out.println("Data: " + chamado.getData());
        System.out.println("Situação: " + chamado.getSituacao());
        System.out.println("Equipamentos: " + chamado.getEquipamentos());
        System.out.println("Técnico: " + chamado.getTecnico().getNome());
        System.out.println("Solução: " + chamado.getSolucao());
        System.out.println("Categoria: " + chamado.getCategoria());
    }
}
