package med.voll.alura.api.controllers;

import med.voll.alura.api.model.Medico;
import med.voll.alura.api.model.dtos.DadosCadastroMedico;
import med.voll.alura.api.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public Medico cadastrarMedicos(@RequestBody DadosCadastroMedico medicoDTO){
        return medicoRepository.save(new Medico(medicoDTO));
    }
}
