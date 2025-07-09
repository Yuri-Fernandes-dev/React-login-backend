package com.javesitemas.cadastro_react.controller;


import com.javesitemas.cadastro_react.model.Usuario;
import com.javesitemas.cadastro_react.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return  usuarioService.salvarUsuario(usuario);
    }


    @GetMapping
    public List<Usuario> listarUsuarios(){
       return usuarioService.mostrarUsuario();
    }



}
