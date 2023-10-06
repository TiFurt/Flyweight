package projeto.software;

import java.util.HashMap;
import java.util.Map;

public class MedicacaoFactory {
    private static Map<String, Medicacao> medicacoes = new HashMap<>();

    public static Medicacao getMedicacao(String nome, String tipo) {
        Medicacao medicacao = medicacoes.get(nome);

        if (medicacao == null) {
            medicacao = new Medicacao(nome, tipo);
            medicacoes.put(nome, medicacao);
        }

        return medicacao;
    }

    public static int getTotalMedicacoes() {
        return medicacoes.size();
    }
}
