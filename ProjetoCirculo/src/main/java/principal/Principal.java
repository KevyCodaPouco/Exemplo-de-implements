
package principal;
import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {
    public static void main (String[] args){
    Circulo cir = new Circulo();
   cir.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo")));
   JOptionPane.showMessageDialog(null,"a area do triangulo é %.2f" + cir.getArea());
    } 
}
