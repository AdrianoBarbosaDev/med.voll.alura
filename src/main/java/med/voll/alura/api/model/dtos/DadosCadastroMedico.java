package med.voll.alura.api.model.dtos;

import med.voll.alura.api.model.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
