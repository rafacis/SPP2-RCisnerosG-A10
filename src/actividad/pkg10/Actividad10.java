/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg10;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Actividad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = Int("el tamaño de los arreglos: ");
        int [][] a = CrearMatriz("A",tamaño);
        int [][] b = CrearMatriz("B",tamaño);
        RestaMatriz(a,b);
        MultiplicacionMatriz(a,b);
    }
    public static int Int(String mensaje){
        Scanner T = new Scanner (System.in);
        int VarEntera = 0;
        boolean flag;
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        VarEntera = T.nextInt();
        flag = false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag = true;
            T.nextLine();
    } 
  } while (flag); 
    return VarEntera;
    }
    public static int [][] CrearMatriz(String mensaje, int tamaño){
        System.out.println("\nIntroduzca el contenido de la matriz " + mensaje);
        int[][]Matrix = new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es " + Matrix.length);
        for (int i = 0; i < Matrix.length; i++){
            for (int j = 0; j < Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor (" + i +"," + j +"): ");
            }
        }
        return Matrix;
        }
    public static void MultiplicacionMatriz(int[][] a,int[][] b){
        int[][]r = new int[a.length][a.length];
        System.out.println("\nProductos");
        for (int i = 0; i < r.length; i++){
            for (int j = 0; j < r.length; j++){
                for (int z = 0; z < r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }    
    public static void RestaMatriz(int[][] a,int[][] b){
        int[][]r = new int[a.length][a.length];
        System.out.println("\nResta");
        for (int i = 0; i < r.length; i++){
            for (int j = 0; j < r[i].length; j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }
}
