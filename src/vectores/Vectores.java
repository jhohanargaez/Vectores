package vectores;
import javax.swing.*;


public class Vectores {

    public static void main(String[] args) {
        int v1[]=new int[10];
        int v2[]=new int[10];
        Llenar(v1,v2);
    }
    public static void Llenar(int []v1, int []v2){
        int dato,i,j;
        i=j=0;
        while((i<10)||(j<10)){
            dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor:"));        
        
        if ((dato>20)&&(i<10)){            
            v1[i]=dato;
            i++;
            if(i==10){
                JOptionPane.showMessageDialog(null,"El vector de numeros mayores de 20 esta lleno, solo digite numeros menores de 20");
                Mostrar(v1);
            }
                        
        }
        else if((dato<20)&&(j<10)){
                v2[j]=dato;
                j++;
                if(j==10){
                JOptionPane.showMessageDialog(null,"El vector de numeros menores de 20 esta lleno, solo digite numeros mayores de 20");
                Mostrar(v2);
                }
            }                        
                
        }               
     }
    public static void Mostrar(int v1[]){
        String cad="";        
        for (int i=0;i<10;i++) {
                cad=cad+v1[i]+",";
            }
        JOptionPane.showMessageDialog(null,cad);      
        
    }
}
