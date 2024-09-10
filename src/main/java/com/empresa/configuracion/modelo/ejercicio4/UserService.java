package com.empresa.configuracion.modelo.ejercicio4;

import org.springframework.stereotype.Component;

@Component
//@Data
public class UserService {
    public int getServiceId() {
        return this.hashCode();
    }
}
