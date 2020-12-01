
package Fuentes;

import java.util.Scanner;

public class Rectangulo {
        private double base, altura;
        
        public Rectangulo() {
            this.altura=0;
            this.base=0;
        }
        
        public void proceso(){
            Scanner sc=new Scanner(System.in);
            try{
                System.out.println("Introduzca la base del rectangulo: ");
                this.base=sc.nextDouble();
                System.out.println("Introduzca la altura del rectangulo: ");
                this.altura=sc.nextDouble();
            }
            catch(Exception e){
                System.out.println("Por favor ingrese numeros " + e);
            }
            System.out.println("Base= " + this.base + "\nAltura= " + this.altura);
            System.out.println("Area= " + area() + "\nPerimetro= " + perimetro());
        }
    
        public double area(){
            return this.altura*this.base;
        }

        public double perimetro(){
            return 2*(this.base+this.altura);
        }
}
