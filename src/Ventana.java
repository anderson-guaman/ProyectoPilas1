import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtDatoEntero;
    private JButton btnInsertar;
    private JLabel lbValorTope;
    private JButton btnValorTope;
    private JButton btnExtraer;
    private JButton btnListar;
    private JTextArea txtListadoElementos;
    private Pila coleccion=new Pila();


    public Ventana() {
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coleccion.ingresar(Integer.parseInt(txtDatoEntero.getText()));
                JOptionPane.showMessageDialog(null,"Dato ingresado a la pila");
            }
        });
        btnValorTope.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lbValorTope.setText("El valor del tope es: "+coleccion.elementoTop());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnExtraer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"Se elimino el elemnto: "+coleccion.extraer());
                    txtListadoElementos.setText(coleccion.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListadoElementos.setText(coleccion.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
