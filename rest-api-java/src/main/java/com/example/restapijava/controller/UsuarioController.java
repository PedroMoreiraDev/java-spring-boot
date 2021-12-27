package com.example.restapijava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.restapijava.repository.UsuarioRepository;
import com.example.restapijava.entities.UsuarioEntity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping("/salvar")
    public UsuarioEntity salvar(@RequestBody UsuarioEntity usuario){
        return usuarioRepository.saveAndFlush(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity consultar (@PathVariable("id") Integer id){
        return usuarioRepository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
    }


}
