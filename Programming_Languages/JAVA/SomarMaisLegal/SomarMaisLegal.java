package SomarMaisLegal;
import javax.swing.JOptionPane;
public class SomarMaisLegal {
    public static void main(String[] args) {
        double num1, num2, num3;
        
        JOptionPane.showMessageDialog
            (null, "Vamos somar.","Soma",
                    JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite o primeiro número."));
        num2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite o segundo número."));
        num3 = num1 + num2;
        JOptionPane.showMessageDialog
            (null, num3,"Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}