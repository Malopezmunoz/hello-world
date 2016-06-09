
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Coche extends Vehiculo //Cabecera de la subclase o clase derivada
{
    //Cuerpo de la subclase o clase derivada
    //Añadimos atributos propios de la subclase Coche
    private int numerodepuertas;
       
    //Nuevo constructor de la subclase o clase derivada más los atrbitos que hereda de la superclase
    Coche(String matricula, String color, int numruedas, int cilindrada, int potencia, int numerodepuertas)
    {
        super(matricula, color, numruedas, cilindrada, potencia);
        this.numerodepuertas = numerodepuertas;
    }
       
    //Métodos setter y getter para el atributo numerodepuertas
    public void set_numerodepuertas(int numerodepuertas)
    {
        this.numerodepuertas = numerodepuertas;
    }
        
    public int get_numerodepuertas()
    {
        return numerodepuertas;
    }
    
    //Método toString
    public String toString()
    {
        return " Número de puertas: " + numerodepuertas + super.toString();
    }
}