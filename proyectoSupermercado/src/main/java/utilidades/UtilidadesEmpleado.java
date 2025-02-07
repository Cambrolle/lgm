package utilidades;

import modelos.Empleado;
import modelos.Empresa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesEmpleado {
    public Map<String, List<Empleado>> getEmpleadosPorLetraDNI(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(
                        empleado -> empleado.getDni().substring(8)
                ));
    }

    public Map<Empresa, List<Empleado>> getEmpleadosPorEmpresa(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getEmpresa));
    }
}
