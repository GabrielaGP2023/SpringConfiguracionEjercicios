package externo.configuracion.singleton.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
//@Data
public class UserService {
    public int getServiceId() {
        return this.hashCode();
    }
}
