package com.empresa.configuracion.modelo.ejercicio5;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Task {
    public int getTaskId(){
        return this.hashCode();
    }
}
