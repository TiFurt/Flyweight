package projeto.software;

public class Medico {
    public void prescreverMedicacao(Paciente paciente, String nome, String tipo) {
        Medicacao medicacao = MedicacaoFactory.getMedicacao(nome, tipo);
        paciente.setMedicacao(medicacao);
    }
}
