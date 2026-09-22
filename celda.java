public class celda {
    private final String codigo;
    private boolean ocupada;
    private vehiculo vehiculo;

    public celda(String codigo) {
        this.codigo = codigo;
        this.ocupada = false;
        this.vehiculo = null;
    }

    public boolean ocupar(vehiculo v) {
        if (ocupada) {
            System.out.println("No se puede ocupar la celda " + codigo + ": ya está ocupada.");
            return false;
        }
        if (v == null) {
            System.out.println("No se puede ocupar la celda " + codigo + ": vehículo inválido.");
            return false;
        }
        this.vehiculo = v;
        this.ocupada = true;
        System.out.println("Celda " + codigo + " ocupada correctamente.");
        return true;
    }

    public boolean liberar() {
        if (!ocupada) {
            System.out.println("No se puede liberar la celda " + codigo + ": ya está libre.");
            return false;
        }
        this.vehiculo = null;
        this.ocupada = false;
        System.out.println("Celda " + codigo + " liberada correctamente.");
        return true;
    }

    public String estado() {
        if (ocupada) {
            return "Celda " + codigo + ": ocupada por " + vehiculo.descripcion();
        }
        return "Celda " + codigo + ": libre";
    }

    public String getcodigo() { return codigo; }
    public boolean isocupada() { return ocupada; }
    public vehiculo getvehiculo() { return vehiculo; }
}

