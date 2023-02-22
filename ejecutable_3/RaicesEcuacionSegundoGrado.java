package ejecutable_3;

import javax.swing.JOptionPane;

public class RaicesEcuacionSegundoGrado 
{

    public static void main(String[] args) 
    {

        // Solicitamos los coeficientes de la ecuación de segundo grado
        String aStr = JOptionPane.showInputDialog("Ingrese el coeficiente 'a' de la ecuación de segundo grado:");
        String bStr = JOptionPane.showInputDialog("Ingrese el coeficiente 'b' de la ecuación de segundo grado:");
        String cStr = JOptionPane.showInputDialog("Ingrese el coeficiente 'c' de la ecuación de segundo grado:");

        // Convertimos los coeficientes a números enteros
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int c = Integer.parseInt(cStr);

        // Calculamos el discriminante de la ecuación
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Comprobamos si la ecuación tiene raíces reales o complejas
        if (discriminante < 0) 
        {
            JOptionPane.showMessageDialog(null, "La ecuación tiene raíces complejas.");
        } 
        else if (discriminante == 0) 
        {
            double raiz = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "La ecuación tiene una única raíz real: " + raiz);
        } 
        else 
        {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            JOptionPane.showMessageDialog(null, "La ecuación tiene dos raíces reales: " + raiz1 + " y " + raiz2);
        }
    }
}

