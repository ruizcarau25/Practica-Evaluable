package com.salesianostriana.dam.spring.data.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "Pelicula")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pelicula {

    @Id @GeneratedValue
    private Long id;

    private String titulo;
    private Integer anioEstreno;

    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    @JoinColumn(
            name = "critica_id"
    )
    List <Critica> listaCriticas = new ArrayList();

    @ManyToMany
    @Builder.Default
    @JoinColumn(
            name = "genero_id"
    )
    List <Genero> listaGeneros = new ArrayList<>();


}
