package eva1_practica_1;

import java.util.Scanner;

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_PRACTICA_1 {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        System.out.println("¿Cúantas edades va a introducir? ");
        int iEdades = sC.nextInt();
        int[] iArreEdades = new int[iEdades];
        //SE LLENAN LOS VALORES DEL ARREGLO CON LO QUE INGRESE EL USUARIO
        for (int i = 0; i < iEdades; i++) {
            System.out.println("Ingresa la edad " + (i + 1) + " de " + iEdades);
            iArreEdades[i] = sC.nextInt();
        }
        //IMPRIMIR ARREGLO
        for (int iArreEdade : iArreEdades) {
            System.out.print(" [" + iArreEdade + "] ");
        }
        //CALCULAR LA MEDIA
        double iSuma = 0;
        for (int i = 0; i < iEdades; i++) {
            iSuma = iSuma + iArreEdades[i]; //LOS VALORES DEL ARREGLO SE SUMARAN A iSuma
        }
        double iProm = iSuma / iArreEdades.length;
        System.out.println("    ");
        System.out.println("La media es: " + iProm);

        //CALCULAR LA MODA
        int iMaxRep = 0;
        int iModa = 0;
        for (int i = 0; i < iArreEdades.length; i++) {
            int NumRep = 0; 
            
            for (int j = 0; j < iArreEdades.length; j++) {
                if (iArreEdades[i] == iArreEdades[j]) {
                    NumRep++;
                }
            }
            /*SI EL NUMERO DE VECES QUE SE REPITIO EL NUMERO ES MAYOR AL MAXIMO 
            Y ES MAYOR A 1 EL VALOR SERA TOMADO COMO LA MODA */
            
            if (NumRep > iMaxRep && NumRep>1) {//SI UN NUMERO SE REPITE SOLO UNA VEZ NO PUEDE SER LA MODA
                iModa = iArreEdades[i];
                iMaxRep = NumRep;
            }
        }
        System.out.println("La moda es " + iModa + " y se repitio " + iMaxRep);

        //CALCULAR DESVIACION ESTANDAR
        double iSumaCuadrada = 0;
        for (int i = 0; i < iEdades; i++) {
            /*A CADA ELEMENTO DEL ARREGLO SE LE SERA RESTADA LA MEDIA Y SE ELEVARA AL CUADRADO
          Y SE LE AGREGARA AL VALOR DE SUMA*/
            iSumaCuadrada = iSumaCuadrada + Math.pow((iArreEdades[i] - iProm), 2);
        }
        /*EL VALOR RESULTANTE SERA DIVIDIDO ENTRE EL NUMERO DE EDADES REGISTRADAS 
         Y SE SACARA LA RAIZ DEL RESTO*/
        double iDesEst = Math.sqrt(iSumaCuadrada / iArreEdades.length);
          System.out.println("Desviacion Estandar: " + iDesEst);  
    }
}
