package projeto.software;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedicoTest {
    private Medico medico;

    @BeforeEach
    void setUp() {
        medico = new Medico();
    }

    @Test
    void prescreverMedicacao() {
        Paciente paciente = new Paciente("João");
        Paciente paciente2 = new Paciente("Maria");
        Paciente paciente3 = new Paciente("José");
        medico.prescreverMedicacao(paciente, "Dipirona", "Comprimido");
        medico.prescreverMedicacao(paciente2, "Dipirona", "Comprimido");
        medico.prescreverMedicacao(paciente3, "Paracetamol", "Comprimido");


        assertEquals(2, MedicacaoFactory.getTotalMedicacoes());
    }
}