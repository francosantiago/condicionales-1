package ejecutable;

public class Ejecutable
{
    public static void main(String[] args) 
    {
        int x;
        int y;
        int z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del segundo número: "));
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del tercer número: "));

        if (x > y && x > z) 
        {
            JOptionPane.showMessageDialog(null, "El número mayor es el " + x);
        } 
        else if (y > x && y > z) 
        {
            JOptionPane.showMessageDialog(null, "El número mayor es el " + y);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "El número mayor es el " + z);
        }
    }
}