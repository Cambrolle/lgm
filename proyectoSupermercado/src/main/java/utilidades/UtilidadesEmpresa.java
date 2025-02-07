package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;
import modelos.TipoEmpresa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesEmpresa {
    public Map<TipoEmpresa, Integer> getNumEmpresasPorTipo(List<Empresa> empresas) {
        return empresas.stream()
                .collect(Collectors.groupingBy(
                        Empresa::getTipoEmpresa,
                        Collectors.summingInt(e -> 1)
                ));
    }

    public Map<TipoEmpresa, Integer> getNumEmpleadosPorTipoEmpresa(List<Empresa> empresas) {
        return empresas.stream()
                .collect(Collectors.groupingBy(
                        Empresa::getTipoEmpresa,
                        Collectors.summingInt(empresa -> empresa.getEmpleados().size())
                ));
    }

    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresa) {
        return empresa.getEmpleados().stream()
                .collect(Collectors.groupingBy(empleado -> empleado.getContrato().getTipoContrato()));
    }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas) {
        return empresas.stream()
                .collect(Collectors.toMap(
                        empresa -> empresa,
                        empresa -> empresa.getEmpleados().stream()
                                .collect(Collectors.groupingBy(empleado -> empleado.getContrato().getTipoContrato()))
                ));
    }
}
