package ejecutable_2;

import javax.swing.JOptionPane;

public class CostoLlamadaTelefonica 
{
    public static void main(String[] args) 
    {
        int duracionLlamada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración de la llamada en minutos: "));
        int costoLlamada = 0;
        if (duracionLlamada <= 3) 
        {
            costoLlamada = 300;
        } else 
        {
            costoLlamada = 300 + (duracionLlamada - 3) * 50;
        }
        JOptionPane.showMessageDialog(null, "El costo de la llamada es de $" + costoLlamada);
    }
}
