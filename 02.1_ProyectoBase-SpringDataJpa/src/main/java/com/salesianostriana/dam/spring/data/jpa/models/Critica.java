package com.salesianostriana.dam.spring.data.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity(name = "Critica")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Critica {

    @Id @GeneratedValue
    private Long id;

    private String autor;
    private String texto;
    private Double puntuacion;


}
