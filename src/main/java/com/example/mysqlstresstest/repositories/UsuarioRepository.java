package com.example.mysqlstresstest.repositories;

import com.example.mysqlstresstest.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, BigDecimal> {
}
