import javax.swing.JOptionPane;

public class Tecnologia extends Producto implements Imprimible {
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
        JOptionPane
                .showMessageDialog(null,
                        "Descripcion: " + descripcion + "\nCategoria: " + categoria + "\nId: " + getId() + "\nStock: "
                                + getStock() + "\nValor: $" + getValor(),
                        "TECNOLOGIA", JOptionPane.INFORMATION_MESSAGE);
    }
}
