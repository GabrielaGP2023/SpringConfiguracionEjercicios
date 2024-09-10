package com.empresa.configuracion.modelo.ejercicio3;

import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class ConfiguracionProyecto {
    @Value("${app.nombre}")
    private String nombreApp;

    @Value("${app.version}")
    private String versionApp;
}
