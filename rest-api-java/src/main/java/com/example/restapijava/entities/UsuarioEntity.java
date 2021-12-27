package com.example.restapijava.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity()
@Table(name="Usuarios")

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id", nullable = false, unique = true)
    private Integer id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="login", nullable = false, unique = true)
    private String login;

    @Column(name="senha", nullable = false, unique = true)
    private String senha;
}
