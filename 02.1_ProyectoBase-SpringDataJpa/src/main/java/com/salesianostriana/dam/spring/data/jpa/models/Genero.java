package com.salesianostriana.dam.spring.data.jpa.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity(name = "Genero")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Genero {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    @JoinColumn
    @Builder.Default
    @ManyToMany
    List <Pelicula> listaPeliculasPorGenero = new ArrayList();

}
