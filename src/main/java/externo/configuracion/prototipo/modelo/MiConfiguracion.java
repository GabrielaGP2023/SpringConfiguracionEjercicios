package externo.configuracion.prototipo.modelo;

import externo.configuracion.singleton.modelo.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MiConfiguracion {
@Bean
@Scope("prototype")
public Task crearPrototipe(){
    return new Task();
}
}
