package Main.java;

public class Electrodomesticos extends Tecnologia implements Imprimible {
    private String marca;
    private String garantia;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    @Override
    public void setDescripcion(String descripcion) {
        super.setDescripcion(descripcion);
    }

    @Override
    public void setCategoria(String categoria) {
        super.setCategoria(categoria);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }
    /*
    @Override
    public void setExistencia(int existencia) {
        super.setExistencia(existencia);
    }

    @Override
    public void setPrecio(double d) {
        super.setPrecio(d);
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Selección: " + descripcion + "\nMarca: " + marca + "\nId: " + getId() + "\nMarca: "
                        + getMarca() + "\nExistencia: " + getExistencia() + "\nPrecio: $" + getPrecio() + "\nGarantia: "
                        + getGarantia(),
                "Electrodomésticos", JOptionPane.INFORMATION_MESSAGE);
    }

    */
}
