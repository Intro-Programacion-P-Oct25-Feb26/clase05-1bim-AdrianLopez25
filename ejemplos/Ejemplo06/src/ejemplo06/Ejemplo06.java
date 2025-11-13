/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo06;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int dia_pago;
        double costo_fijo = 25;
        double descuento;
        double total;
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese su dia de pago");
        dia_pago = entrada.nextInt();
        
        descuento  = (costo_fijo * 0.5);
        total = (costo_fijo - descuento);
       
        if ((dia_pago < 10) && 
                (parroquia.equals("El valle")||parroquia.equals("El sagrario"))){
            System.out.printf("Nombre: %s Apellido: %s Usuario: %s "
                    + "Edad: %s Parroquia:%s Dia pago:%s\nDescuento: $%s\n"
                    + "Total: $%s\n", 
                    nombre,apellido,usuario,parroquia,edad,dia_pago,descuento
                    ,total );
            
        }else {
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: "
                    + "%s\nParroquia: %s\nDia de pago: %s\nMensualidad: $%s\n"
                    + "Descuento: $0\nTotal a Pagar: $%s\n",nombre, apellido, usuario,
                    edad, parroquia, dia_pago, costo_fijo, costo_fijo);

        }
        
        
        
        
        
       
    }
    
}
