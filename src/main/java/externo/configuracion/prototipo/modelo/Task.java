package externo.configuracion.prototipo.modelo;

import org.springframework.stereotype.Component;



public class Task {
    public int getTaskId(){
        return this.hashCode();
    }
}
