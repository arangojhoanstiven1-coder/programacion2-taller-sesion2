public class vehiculo {
    private final String placa;
    private final String tipo;
    private final String propietario;

    public vehiculo(String placa, String tipo, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String descripcion() {
        return "Placa: " + placa + ", tipo: " + tipo + ", propietario: " + propietario;
    }

    public String getplaca() { return placa; }
    public String gettipo() { return tipo; }
    public String getpropietario() { return propietario; }
}

