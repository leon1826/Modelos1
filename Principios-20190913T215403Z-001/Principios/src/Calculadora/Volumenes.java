/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Leon1
 */
public class Volumenes {
    public float res;
    public void Cubo(float n1){
        res= n1*n1*n1;
    }
    
    public void Prisma(float n1, float n2,float n3){
        res= (n1*n2*n3);
    }
    
    public void Esfera (float n1){
        res=(float) ((4/3)*(3.14)*(n1*n1*n1));
    }
    
    
}
