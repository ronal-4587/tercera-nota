import javax.swing.JOptionPane;

public class ejercicio {
    public static void main(String[] args) {
    /*Escribe un programa que lea tres números del usuario y determine cuál es el mayor de los tres utilizando una estructura */
    int num1=0,num2=0,num3=0,numMax;
    num1= Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1"));
    num2= Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2"));
    num3= Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 3"));
    for (int i =0;i<=4;i++){
        if(num1>num2 && num1>num3){
            numMax=num1;
        } 
        else if(num2>num1 && num2>num3){
            numMax=num2;
        }
        else{
            numMax=num3;
        }
    }
  }
}
