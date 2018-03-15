/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.JOptionPane;

/**
 *
 * @author MF
 */
public class Estadistica {
    private double[][] datos;
    private double b0;
    private double b1;
    private double rxy;
    private double r2;
    private double yk;
    private double xk;
    private int n;
    
    public double calcularSxy(){
        double suma = 0.0;
        for(int i=0; i<n; i++){
            suma+=datos[i][0]*datos[i][1];
        }
        return suma;
    }
    
    public double calcularSx(){
        double suma = 0.0;
        for(int i=0; i<n; i++){
            suma+=datos[i][0];
        }
        return suma;
    }
    
    public double calcularSy(){
        double suma = 0.0;
        for(int i=0; i<n; i++){
            suma+=datos[i][1];
        }
        return suma;
    }
    
    
    public double calcularSy2(){
        double suma = 0.0;
        for(int i=0; i<n; i++){
            suma+=datos[i][1]*datos[i][1];
        }
        return suma;
    }
    
    public double calcularSx2(){
        double suma = 0.0;
        for(int i=0; i<n; i++){
            suma+=datos[i][1]*datos[i][1];
        }
        return suma;
    }
    
    //--------------------------------------
    public void calcularB1(){
        b1=(calcularSxy()-n*calcularXm()*calcularYm())/(calcularSx2()-n*calcularXm()*calcularXm());
    }
    
    public double calcularXm(){
      return calcularSx()/n;  
    }
    
    public double calcularYm(){
        return calcularSy()/n;
    }
    
    public void calcularB0(){
        b0= calcularYm()-(b1*calcularXm());
    }
    
    public void calcularYk(){
        yk = b0+b1*xk;
    }
    
    public void calcularRxy(){
        rxy = n * calcularSxy()-calcularSx()*calcularSy()/Math.sqrt((n*calcularSx2()-calcularSx()*calcularSx())*(n*calcularSy2()-calcularSy()*calcularSy()));
    }
    
    public void calcularR2(){
        r2=rxy*rxy;
    }
    
    public void setN(int n){
        this.n=n;
    }
    
    public void setXK(double xk){
        this.xk=xk;
    }
    
    public double  getB0(){
        return b1;
    }
    
    public double  getB1(){
        return b1;
    }
    
    public double  getRxy(){
        return rxy;
    }
    
    public double  getR2(){
        return r2;
    }
    
    public double  getYk(){
        return yk;
    }
    
    public void introducirDatos(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos datos tienes?"));
        datos = new double[n][];
        for(int i=0;i<=n;i++){
            datos[i][0] = Double.parseDouble(JOptionPane.showInputDialog("dame el valor de x: "+i));
            datos[i][i] = Double.parseDouble(JOptionPane.showInputDialog("dame el valor de y: "+i));
        }   
    }
}

