import javax.swing.JOptionPane;
public class Esteira{
    //Atributo varíavel normal
    boolean estado;
    //método
    void ligar(){
        estado = true;
        JOptionPane.showMessageDialog(null, "Está ligado");
    }
    void desligar(){
        estado = false;
        JOptionPane.showMessageDialog(null, "Está deligado");
    }
    void entrega(){
        JOptionPane.showMessageDialog(null, "Entrega feita");
    }
    
}