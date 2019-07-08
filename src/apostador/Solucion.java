/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostador;

/**
 *
 * @author DiegoCarrascal
 */
public class Solucion {
    private float A, B, C;

    public Solucion(float A, float B, float C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public String toString() {
        return "Solucion{" + "A=" + A + ", B=" + B + ", C=" + C + '}';
    }
    
    public String toString2(float x, float y, float z) {       
            return "Solucion{" + "A=" + A + ", B=" + B + ", C=" + C + '}' + "\n" + 
                    "A*X=" + A*x + ", B*Y=" + B*y + ", C*Z=" + C*z + "\n" +
                    "MAX: "+ mi_get_max( A*x, B*y,C*z)+ "\n"+ "\n";
    }
    public float get_max(float x, float y, float z){
        return Math.max(Math.max(A*x,B*y),C*z);
    }
    private float mi_get_max(float x, float y, float z){
        return Math.max(Math.max(x,y),z);
    }
    
    public float getA() {
        return A;
    }

    public void setA(float A) {
        this.A = A;
    }

    public float getB() {
        return B;
    }

    public void setB(float B) {
        this.B = B;
    }

    public float getC() {
        return C;
    }

    public void setC(float C) {
        this.C = C;
    }
    
    
}
