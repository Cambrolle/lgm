package utilidades;

import modelos.Contrato;
import modelos.TipoContrato;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesContrato {
    public Map<TipoContrato, Double> getSalarioMedioTipoContrato(List<Contrato> contratos) {
        return contratos.stream()
                .collect(Collectors.groupingBy(
                        Contrato::getTipoContrato,
                        Collectors.averagingDouble(Contrato::getSalarioBase)
                ));
    }

    public Map<TipoContrato, Integer> getNumContratosPorTipo(List<Contrato> contratos) {
        return contratos.stream()
                .collect(Collectors.groupingBy(
                        Contrato::getTipoContrato,
                        Collectors.summingInt(c -> 1)
                ));
    }

    public Map<TipoContrato, List<Contrato>> getListContratosPorTipo(List<Contrato> contratos) {
        return contratos.stream()
                .collect(Collectors.groupingBy(Contrato::getTipoContrato));
    }
}
