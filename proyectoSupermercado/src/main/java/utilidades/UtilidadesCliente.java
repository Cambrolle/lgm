package utilidades;

import modelos.Cliente;

public class UtilidadesCliente {
    public boolean esDniValido(Cliente cliente) {
        String dni = cliente.getDni();
        if (dni.length() != 9) return false;
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) return false;
        }
        return Character.isLetter(dni.charAt(8));
    }
}
