package Main.java;

public class ControlInventario {
    public static void main(String[] args) throws Exception {
        System.out.println("Running");
        Tecnologia PS5 = new Tecnologia();

        PS5.setDescripcion("Play Station 5");
        PS5.setFabricante("SONY");
        PS5.setCategoria("Tecnologia");
        PS5.setId(623548615);
        PS5.setStock(420);
        PS5.setValor(599.99);
        PS5.setGarantia("24 Meses");

        PS5.imprimir();
    }
}