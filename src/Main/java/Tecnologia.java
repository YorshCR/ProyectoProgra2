package Main.java;

import javax.swing.*;

public class Tecnologia extends Producto implements Imprimible {
    private String fabricante;
    private String garantia;

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
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

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }

    @Override
    public void setValor(double d) {
        super.setValor(d);
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Descripcion: " + descripcion + "\nCategoria: " + categoria + "\nId: " + getId() + "\nFabricante: "
                        + getFabricante() + "\nStock: " + getStock() + "\nValor: $" + getValor() + "\nGarantia: "
                        + getGarantia(),
                "TECNOLOGIA", JOptionPane.INFORMATION_MESSAGE);
    }
}
