package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    //atributo de clase
    private static int numCarros = 0;

    public Carro(int potencia, double velocidad){
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro(){
        numCarros++;
    }

    /* metodo set() (establecer valores)
      "siempre" es void, siempre tiene parametro y este es el mismo tipo del atributo */

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    /* metodo get() (obtener información)
    siempre retorna un valor, el tipo de retorno siempre es del mismo tipo del atributo
     */

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public static int getNumCarros(){
        return numCarros;
    }
    //el static permite que el métod pueda ser invocada sin la necesidad de un objeto presente

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= potencia;
    }
}