package med.voll.alura.api.repositories;

import med.voll.alura.api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository <Medico,Long> {
}
