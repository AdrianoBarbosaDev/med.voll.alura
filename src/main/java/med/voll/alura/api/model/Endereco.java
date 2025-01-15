package med.voll.alura.api.model;

import jakarta.persistence.Embeddable;
import lombok.*;
import med.voll.alura.api.model.dtos.DadosEndereco;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(){}

    public Endereco(DadosEndereco enderecoDTO){
        this.logradouro = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.cep = enderecoDTO.cep();
        this.numero = enderecoDTO.numero();
        this.complemento = enderecoDTO.complemento();
        this.cidade = enderecoDTO.cep();
        this.uf = enderecoDTO.uf();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (endereco.logradouro() != null)
            this.logradouro = endereco.logradouro();
        if (endereco.bairro() != null)
            this.bairro = endereco.bairro();
        if (endereco.cep() != null)
            this.cep = endereco.cep();
        if (endereco.uf() != null)
            this.uf = endereco.uf();
        if (endereco.cidade() != null)
            this.cidade = endereco.cidade();
        if (endereco.numero() != null)
            this.numero = endereco.numero();
        if (endereco.complemento() != null)
            this.complemento = endereco.complemento();
    }
}
