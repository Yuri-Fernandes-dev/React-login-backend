package com.javesitemas.cadastro_react.service;


import com.javesitemas.cadastro_react.model.Usuario;
import com.javesitemas.cadastro_react.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;



    public Usuario salvarUsuario(Usuario usuario){
        return  usuarioRepository.save(usuario);

    }


    public List<Usuario> mostrarUsuario(){
        return usuarioRepository.findAll();
    }




}
