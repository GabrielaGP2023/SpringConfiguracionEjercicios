package com.empresa.configuracion.modelo.ejercicio1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @PostConstruct
    public void connect() {
        System.out.println("Conexión a la base de datos establecida");
    }

    @PreDestroy
    public void disconnect() {
        System.out.println("Conexión a la base de datos cerrada");
    }
}
