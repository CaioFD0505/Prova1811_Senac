package br.com.senac.api.repositorios;

import br.com.senac.api.entidades.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcasRepositorio extends JpaRepository<Marcas, Long> {
}
