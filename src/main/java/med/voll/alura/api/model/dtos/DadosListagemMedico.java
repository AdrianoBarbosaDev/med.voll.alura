package med.voll.alura.api.model.dtos;

import med.voll.alura.api.model.Medico;
import med.voll.alura.api.model.enums.Especialidade;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(),medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getEspecialidade());
    }

}
