package com.example.mysqlstresstest.bootstrap;

import com.example.mysqlstresstest.models.Usuario;
import com.example.mysqlstresstest.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class StressTest implements CommandLineRunner {

    private Long INSERTIONS_RANGE = 1000l;
    private Random random = new Random();

    private final UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        insertUsuarios();
    }

    private void insertUsuarios(){
        for(int i = 0 ; i < INSERTIONS_RANGE ; i++){
            Usuario usuario = new Usuario();
            usuario.setNombre(RandomStringUtils.randomAlphanumeric(40));
            usuario.setApellidos(RandomStringUtils.randomAlphanumeric(40));
            usuario.setCorreo(RandomStringUtils.randomAlphanumeric(30));
            usuario.setEdad(random.nextInt());
            usuario.setFechaNacimiento(new Date());

            /*for(int j = 0 ; j < 10 ; j++){
                Contacto contacto = new Contacto();
                contacto.setId(RandomStringUtils.randomAlphanumeric(10));
                contacto.setNombre(RandomStringUtils.randomAlphanumeric(60));
                cliente.addContacto(contacto);
            }*/

            usuarioService.guardaUsuario(usuario);
            System.out.println("Inserted "+i+" registers.");
        }
    }
}
