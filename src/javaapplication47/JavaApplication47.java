/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

import javax.swing.JOptionPane;
/**
 *
 * @author bruno
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        int n;
        int s = 0;
        int verP =0;
        int verI =0;
        int acima=0;
        int cont=0;
        int med;
        
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "<html>Digie um número <br><em>[valor 0 interrompe]</em><html>"));
            if (n % 2 ==0) {
                verP += 1;
            }   else{
               verI += 1; 
            }
            
            if (n > 100) {
                acima += 1;
            }
           s += n;
           cont += 1;
        } while (n != 0);
        
        med = s/cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr><br>"
                + "<em>Total dos valores: </em>" + s + "<br>" 
                + "<em>Total de pares: </em>" + verP + "<br>"
                + "<em>Total de ímpares: </em>" + verI + "<br>"
                + "<em>Acima de 100: </em>" + acima + "<br>"
                + "<em>Média dos valores:</em> " + med);
        
    }
    
}
