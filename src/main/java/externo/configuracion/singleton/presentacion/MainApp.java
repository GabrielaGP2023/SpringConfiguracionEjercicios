package externo.configuracion.singleton.presentacion;


import externo.configuracion.singleton.modelo.MiConfiguracion;
import externo.configuracion.singleton.modelo.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MiConfiguracion.class);

        // Obtener el bean singleton
        UserService s1 = context.getBean(UserService.class);
        UserService s2 = context.getBean(UserService.class);

        // Verificar que ambos beans son la misma instancia
        System.out.println("Hash s1 -> " + s1.getServiceId());
        System.out.println("Hash s2 -> " + s2.getServiceId());



    }
}
