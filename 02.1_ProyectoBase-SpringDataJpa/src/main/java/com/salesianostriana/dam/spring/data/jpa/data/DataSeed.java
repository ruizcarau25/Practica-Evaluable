package com.salesianostriana.dam.spring.data.jpa.data;

import com.salesianostriana.dam.spring.data.jpa.models.Critica;
import com.salesianostriana.dam.spring.data.jpa.models.Genero;
import com.salesianostriana.dam.spring.data.jpa.models.Pelicula;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataSeed {
    @PostConstruct
    public void cargarDatos() {
        Pelicula.builder(
                .titulo("Solo Leveling")
                .anioEstreno(2016)
                .listaCriticas(Critica.builder(
                        .autor("Manuel")
                        .texto("Muy Lenta")
                        .puntuacion(6.5)
                        .build()
                )
                .listaGeneros(Genero.builder(
                        .nombre("Anime")
                        .build()
                );
                )

            )

        )

        Pelicula.builder(
                .titulo("Bullet train")
                .anioEstreno(2024)
                .listaCriticas(Critica.builder(
                        .autor("Jose")
                        .texto("Muy Rapida")
                        .puntuacion(8.5)
                        .build()
                )
                .listaGeneros(Genero.builder(
                        .nombre("Sci-fi")
                        .build()
                );
                )

            )

        )

        Critica.builder(
                .autor("Raul")
                .texto("Aburrida")
                .puntuacion(5.2)
                .build();
        )

    }
}
