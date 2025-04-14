package org.example.EJERCICIO8;

public class Ejercicio8 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.suma(10).resta(2).mult(5);

        System.out.println("El resultado total es: "+calc.getResultado());
    }

    public static class Calculadora{

        private double result;

        public Calculadora(){
            this.result = 0;
            System.out.println("Acumulado: " + this.result);
        }

        public Calculadora suma(double valor){
            this.result += valor;
            System.out.println("Acumulado: " + this.result);
            return this;
        }

        public Calculadora resta(double valor){
            this.result -= valor;
            System.out.println("Acumulado: "+ this.result);
            return this;
        }

        public Calculadora mult(double valor){
            this.result *= valor;
            System.out.println("Acumulado: " + this.result);
            return this;
        }

        public double getResultado(){
            return this.result;
        }
    }


}
