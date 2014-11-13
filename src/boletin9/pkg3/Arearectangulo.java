package boletin9.pkg3;

import javax.swing.JOptionPane;

public class Arearectangulo {
    
    public Arearectangulo(){
        
    }
    private float base , altura;
 
    
    public float validarFloat(){
           float b;
        do{
    String respuesta = JOptionPane.showInputDialog("introduce dato");
     b=Float.parseFloat(respuesta);
    if(b<=0)JOptionPane.showMessageDialog(null,"dato no válido");
        }while(b<=0);
        return b;  
    }
    public void calcular(){
        base=this.validarFloat();
        altura = this.validarFloat();
    JOptionPane.showMessageDialog(null, "O area é igual a :"+(base*altura));
    }
    }
