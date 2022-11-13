/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg7.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class Tarea7Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0,elemento=0;
        Cola colita=new Cola();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la Cola\n"
                                + "2. Quitar un elemento de Cola\n"
                                + "3. ¿La cola está Vacía?\n"
                                + "4. Elemento ubicado al Inicio de la Cola\n"
                                + "5. Tamaño de la Cola\n"
                                + "6. Salir", "Menú de Opciones de una Cola"
                        ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a Insertar","Insertando en la Cola", JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if(!colita.estaVacia()){
                            JOptionPane.showMessageDialog(null,  "El elemento Atendido es " + colita.quitar(),
                                    "Quitando Elementos de la Cola",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,  "La Cola está vacía ",
                                    " Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(colita.estaVacia()){
                            JOptionPane.showMessageDialog(null,  "La Cola está vacía ",
                                    " Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                                  JOptionPane.showMessageDialog(null,  "La Cola NO está vacía ",
                                    " Cola No Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!colita.estaVacia())
                            JOptionPane.showMessageDialog(null,  "El elemento ubicado al inicio de la Cola es " + colita.inicioCola(),
                                    " Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                                JOptionPane.showMessageDialog(null, "La Cola está vacía ",
                                    "Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        }         
                        break;
                     case 5:
                               JOptionPane.showMessageDialog(null,  "El tamaño de la cola es " + colita.tamanioCola(),
                                    " Cola Vacía",JOptionPane.INFORMATION_MESSAGE);
                        break;   
                     case 6:  
                               JOptionPane.showMessageDialog(null, "La Cola está vacía ",
                                    "Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                               JOptionPane.showMessageDialog(null, "Opcion incorrecta ",
                                    "Cuidado",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Aplicacion Finalizada" + n.getMessage());
            }
        }while(opcion!=6);
    }
    
}
