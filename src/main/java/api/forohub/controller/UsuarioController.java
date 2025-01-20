package api.forohub.controller;

import api.forohub.domain.DatosRegistroUsuario;
import api.forohub.usuario.Usuario;
import api.forohub.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
        usuarioRepository.save(new Usuario(datosRegistroUsuario));
    }

    @GetMapping
    public List<Usuario> listadoUsuarios() {
        return usuarioRepository.findAll();
    }
}

