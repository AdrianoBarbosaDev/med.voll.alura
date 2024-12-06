package med.voll.alura.api.controllers;

import med.voll.alura.api.model.dtos.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pacientes")
@RestController
public class PacienteController {
    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dados){
        System.out.println(dados);
    }
}
