package med.voll.alura.api.controllers;

import med.voll.alura.api.model.dtos.DadosCadastroPaciente;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pacientes")
@RestController
public class PacienteController {
    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dados){

    }
}
