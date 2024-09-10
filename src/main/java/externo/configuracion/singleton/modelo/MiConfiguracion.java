package externo.configuracion.singleton.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiConfiguracion {
@Bean
public UserService creaSingleton(){
    return new UserService();
}
}
