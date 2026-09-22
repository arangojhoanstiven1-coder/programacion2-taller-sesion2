public class parqueadero {
    public static void main(String[] args) {
        celda celda1 = new celda("A-01");
        celda celda2 = new celda("A-02");
        celda celda3 = new celda("B-12");

        vehiculo vehiculo1 = new vehiculo("ABC123", "carro", "Johan Arango");
        vehiculo vehiculo2 = new vehiculo("XYZ89D", "moto", "Ana sofia");

        System.out.println("--- Operaciones ---");
        celda1.ocupar(vehiculo1);
        celda1.ocupar(vehiculo2);
        celda2.liberar();
        celda3.ocupar(vehiculo2);

        System.out.println("\n--- Estado final ---");
        System.out.println(celda1.estado());
        System.out.println(celda2.estado());
        System.out.println(celda3.estado());
    }
}
