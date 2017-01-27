import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 46995932D on 12/01/2017.
 */
public class Ejercicio5Empleados {
    public static void main(String[] args) {

        Empleado juan = new Empleado("Juan",35000);
        Empleado diego = new Empleado("Diego", 75000);
        Empleado alvaro = new Empleado("Alvaro", 75000);
        Empleado antonio = new Empleado ("Antonio", 50000);
        Empleado sergi = new Empleado ("Sergi", 85000);


        List<Empleado> empleados = new ArrayList<>();


        empleados.add(juan);
        empleados.add(diego);
        empleados.add(alvaro);
        empleados.add(antonio);
        empleados.add(sergi);

        Empleado max = Collections.max(empleados,
                Comparator.comparing(Empleado::getSueldo));

        Empleado min = Collections.min(empleados,
                Comparator.comparing(Empleado::getSueldo));

        Collections.sort(empleados,
                Comparator.comparing(Empleado::getSueldo));

        System.out.println("Muestro los empleados ordenados por el sueldo de manera ascendente.");
        System.out.println(empleados);

        Collections.sort(empleados,
                Comparator.comparing(Empleado::getSueldo).reversed());

        System.out.println("Muestro los empleados ordenados por el sueldo de manera descendente.");
        System.out.println(empleados);

        System.out.println("Muestro el empleado con sueldo maximo");
        System.out.println(max);
        System.out.println("Muestro el empleado con sueldo minimo");
        System.out.println(min);

        System.out.println(empleados.stream()
                .filter(empleado -> empleado.getSueldo()==75000)
                .collect(Collectors.toList()));


    }
}
