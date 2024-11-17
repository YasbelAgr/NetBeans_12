import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String[] args) {
       byte resp;
       int fact,num,x;
       do{
           fact=1;
           num= Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
       for(x=num; x>=1; x--){
        fact=fact*x;
       }
       JOptionPane.showConfirmDialog(null, "El factorial de "+num+" es: "+fact);
       resp=Byte.parseByte(JOptionPane.showInputDialog("Capture 1, si desea "
               + "realizar otro calculo"));
       }while (resp==1);  
    }
}
