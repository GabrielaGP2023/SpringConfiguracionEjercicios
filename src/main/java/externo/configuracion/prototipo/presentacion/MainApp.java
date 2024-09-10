package externo.configuracion.prototipo.presentacion;


import externo.configuracion.prototipo.modelo.MiConfiguracion;
import externo.configuracion.prototipo.modelo.Task;
import externo.configuracion.singleton.modelo.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MiConfiguracion.class);

        // Obtener el bean singleton
        Task t1 = context.getBean(Task.class);
        Task t2 = context.getBean(Task.class);

        // Verificar que ambos beans son la misma instancia
        System.out.println("Hash s1 -> " + t1.getTaskId());
        System.out.println("Hash s2 -> " + t2.getTaskId());



    }
}
