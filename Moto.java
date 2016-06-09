
/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Moto extends Vehiculo
{
    //Atributos de la subclase Moto
    private int numerodeplazas;
   
    //Métodos
    //Constructor parametrizado
    Moto(String matricula, String color, int numruedas, int cilindrada, int potencia, int numerodeplazas)
    {
        super(matricula, color, numruedas, cilindrada, potencia);
        this.numerodeplazas = numerodeplazas;
    }
    
    //Métodos setter y getter para la variable numerodeplazas
    public void set_numerodeplazas(int numerodeplazas)
    {
        this.numerodeplazas = numerodeplazas;
    }
    public int get_numerodeplazas()
    {
        return numerodeplazas;
    }
    
    //Sobreescritura del método toString
    public String toString()
    {
        return " Número de plazas: " + numerodeplazas + super.toString();
    }
}
