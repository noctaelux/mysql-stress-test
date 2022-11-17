package com.example.mysqlstresstest.service;

import com.example.mysqlstresstest.models.Usuario;
import com.example.mysqlstresstest.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public void guardaUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
