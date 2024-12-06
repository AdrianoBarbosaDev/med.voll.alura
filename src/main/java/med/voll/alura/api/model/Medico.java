package med.voll.alura.api.model;

import jakarta.persistence.*;
import lombok.*;
import med.voll.alura.api.model.dtos.DadosCadastroMedico;
import med.voll.alura.api.model.enums.Especialidade;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dadosDTO){
        this.id = null;
        this.nome = dadosDTO.nome();
        this.email = dadosDTO.email();
        this.crm = dadosDTO.email();
        this.especialidade = dadosDTO.especialidade();
        this.endereco = new Endereco(dadosDTO.endereco());
    }
}
