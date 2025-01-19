package api.forohub.controller;

import api.forohub.domain.DatosRegistroUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public void registrarUsuario(@RequestBody DatosRegistroUsuario datosRegistroUsuario){
        System.out.println(datosRegistroUsuario);
    }
}

