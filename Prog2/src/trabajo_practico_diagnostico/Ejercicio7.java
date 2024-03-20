package trabajo_practico_diagnostico;

import javax.swing.*;
//Imaginemos que la classe se llama CalculadoraPolacaInversaApp, siento que es indiferente y quería que cada clase esté ordenada por el número de ejercicio
public class Ejercicio7 {
    public static void main(String[] args) {

        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer operando (int):"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo operando (int):"));
        String signo = JOptionPane.showInputDialog("Ingrese el signo aritmético (+, -, *, /, ^, %):");


        double resultado = 0;
        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                    return;
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo aritmético no válido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}