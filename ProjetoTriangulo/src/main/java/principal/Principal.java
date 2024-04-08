package Principal;

import model.Triangulo;
import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args){
       Triangulo tril = new Triangulo();
       
       tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("digite a base do triangulo")));
       tril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("digite a altura do triangulo")));
       JOptionPane.showMessageDialog(null, "a area do triangulo é " + tril.getArea());
    }
}