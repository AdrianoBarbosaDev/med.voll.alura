package med.voll.alura.api.controllers;

import jakarta.validation.Valid;
import med.voll.alura.api.model.dtos.DadosAtualizacaoMedico;
import med.voll.alura.api.model.dtos.DadosListagemMedico;
import med.voll.alura.api.model.Medico;
import med.voll.alura.api.model.dtos.DadosCadastroMedico;
import med.voll.alura.api.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrarMedicos(@RequestBody @Valid DadosCadastroMedico medicoDTO){
        medicoRepository.save(new Medico(medicoDTO));
    }

    @GetMapping
    public Page<DadosListagemMedico> buscarMedico(@PageableDefault(size = 10, sort = {"nome"}) Pageable pagina){
        return medicoRepository.findAll(pagina).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico atualizacaoMedicoDTO){
        var medico = medicoRepository.getReferenceById(atualizacaoMedicoDTO.id());
        medico.atualizarInformacoes(atualizacaoMedicoDTO);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exlcluir(@PathVariable Long id){
        medicoRepository.deleteById(id);
    }
}
